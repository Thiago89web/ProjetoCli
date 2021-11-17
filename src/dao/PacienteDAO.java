
package dao;

import Utilitarios.FabricaConexao;
import Utilitarios.Formatacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empresa;
import model.Paciente;
import model.Pessoa;


public class PacienteDAO { 
    private PessoaDAO pessoaDAO;
    private final static String CADASTRAR_PACIENTE = "INSERT INTO pacientes (responsavel, cpf, rg, data_nascimento, "
    + " id_pessoa_paciente) VALUES ( ?, ?, ?, ?, ?)";
    private final static String BUSCAR_PACIENTE = "";
    private final static String LISTAR_PACIENTE = "SELECT id_paciente, pessoas.nome, responsavel, cpf, rg, "
    + "data_nascimento, empresas.nome_fantasia, pessoas.email FROM pacientes, pessoas, empresas "
    + "WHERE pacientes.id_pessoa_paciente = pessoas.id_pessoa ORDER BY id_paciente DESC LIMIT 15";
    private final static String PREENCHER_CAMPOS = "SELECT id_paciente, responsavel, cpf, rg, data_nascimento, "
    + "nome, email, cep, bairro, endereco, numero, cidade, estado, sexo FROM  pacientes "
    + "INNER JOIN pessoas on id_pessoa =  id_pessoa_paciente WHERE id_paciente = ?";    
    private final static String EDITAR_PACIENTE = "UPDATE pacientes SET responsavel = ?, cpf = ?, rg = ?, "
    + "data_nascimento = ?, id_pessoa_paciente = ? WHERE id_paciente = ?";
    private final static String REMOVER_PACIENTE = "DELETE FROM pacientes WHERE id_paciente = ?";
    private final static String PACIENTE = "SELECT id_paciente, responsavel, cpf, rg, data_nascimento, "
    + "id_pessoa_paciente, id_pessoa, nome, email, cep, bairro, endereco, numero, cidade, estado, sexo, "
    + "id_empresa FROM pacientes INNER JOIN pessoas on id_pessoa =  id_pessoa_paciente WHERE id_paciente = ?";
   

    public PacienteDAO() {
        this.pessoaDAO = new PessoaDAO();
        
    }   

    
    public void listarPaciente(DefaultTableModel modelo) {        
       try {          
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(LISTAR_PACIENTE);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {             
            
            modelo.addRow(new Object[]{
                rs.getInt("id_paciente"),
                rs.getString("nome"),
                rs.getString("responsavel"),
                rs.getString("cpf"),                                        
                Formatacao.converterParaJava(rs.getString("data_nascimento")),
                rs.getString("email"),
                rs.getString("nome_fantasia")});                
            } 
            
           FabricaConexao.fecharConexao();
        } catch (SQLException ex) {        
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
    }               
   
    public boolean cadastrarPaciente(Paciente paciente) { 
        int id_pessoa = 0;
        Connection conn = null;
        PreparedStatement st = null, stmpes = null;
        ResultSet rs = null;
      
       try { 
            conn =  FabricaConexao.getConexao();
            conn.setAutoCommit(false);
            // Cadastrar pessoa
            if(paciente.getPessoa() != null){                   
                id_pessoa = this.pessoaDAO.cadastrar(conn, stmpes, rs, paciente.getPessoa());
                if(id_pessoa == java.sql.Types.NULL)
                    return false;                   
            }           
            // Cadastrar paciente
            st = conn.prepareStatement(CADASTRAR_PACIENTE);           
            st.setString(1, paciente.getReponsavel());
            st.setString(2, paciente.getCpf());
            st.setString(3, paciente.getRg());
            st.setDate(4, new java.sql.Date(paciente.getData_nascimento().getTime()));
            if (id_pessoa == 0) {
                st.setNull(5, Types.NULL);
            } else {
                st.setInt(5, id_pessoa);
            }
                    
            st.executeUpdate();
            conn.commit();
           // System.out.println(""+paciente.getId_paciente()+""+paciente.getData_nascimento());
            JOptionPane.showMessageDialog(null,"Registro salvo com sucesso");
            return true;       
        } catch (SQLException ex){
            System.out.println(ex);
        } finally{           
            try{                
                if(conn!=null) conn.close();
                if(st!=null) st.close();
                if(rs!=null) rs.close();
            } catch(Exception ex){
                System.out.println("ERROR (Cadastrar Paciente) - Ao fechar a conexão ou prepared statement");
            }
        }
        return false;
    }
            /*FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }           
        return true;
    }*/

    
    public boolean editarPaciente(Paciente paciente){
        int id_pessoa = 0;
        boolean removerPessoa = false;
        Connection conn = null;
        PreparedStatement st = null, stmpes = null;
        ResultSet rs = null;
        try {
            conn =  FabricaConexao.getConexao();
            conn.setAutoCommit(false);
            
            Paciente buscaPaciente = this.paciente(paciente.getId_paciente());            
            if(paciente.getPessoa() != null) {
                
                // Editar endereço
                if(paciente.getPessoa().getId_pessoa() != 0){
                    id_pessoa = this.pessoaDAO.editar(conn, stmpes, paciente.getPessoa());                   
                } else {                   
                    // Cadastrar pessoa nova
                    id_pessoa = this.pessoaDAO.cadastrar(conn, stmpes, rs, paciente.getPessoa());                    
                    if(id_pessoa == 0)
                        return false;
                }
            } else if (buscaPaciente.getPessoa() != null) {                
                removerPessoa = true;
                id_pessoa = 0;
            }
            
            st = conn.prepareStatement(EDITAR_PACIENTE);
            st.setString(1, paciente.getReponsavel());
            st.setString(2, paciente.getCpf());
            st.setString(3, paciente.getRg());
            st.setDate(4, new java.sql.Date(paciente.getData_nascimento().getTime()));
            
            if (id_pessoa == 0) 
                st.setNull(5, Types.NULL);
            else 
                st.setInt(5, id_pessoa);
              st.setInt(6, paciente.getId_paciente());           
            st.executeUpdate();
            
            if (removerPessoa) {               
                this.pessoaDAO.remover(conn, stmpes, buscaPaciente.getPessoa().getId_pessoa());
            }
            
            conn.commit();
             JOptionPane.showMessageDialog(null,"Registro editado com sucesso");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
            try{
                if(conn!=null) conn.close();
                if(st!=null) st.close();
                if(stmpes!=null) stmpes.close();
                if(rs!=null) rs.close();
            } catch(Exception ex){
                System.out.println("ERROR (Editar Paciente) - Ao fechar a conexão ou prepared statement");
            }
        }
        return false;
    }
    
    
    public boolean deletarPaciente(Paciente paciente){
        Connection conn = null;
        PreparedStatement stmt = null, stmpes = null;
        try {
            conn = FabricaConexao.getConexao();
            conn.setAutoCommit(false);  
                      
            // Remover pessoa 
            System.out.println("Pessoa" + paciente.getPessoa().getId_pessoa()); 
            Pessoa p = new Pessoa();
            p.setId_pessoa(paciente.getId_paciente());
            paciente.setPessoa(p);
            System.out.println("Pessoa" + paciente.getPessoa().getId_pessoa());
                                   
            this.pessoaDAO.remover(conn, stmpes, paciente.getPessoa().getId_pessoa());
          
            // Remover paciente
            System.out.println("Paciente" + paciente.getId_paciente());
            stmt = conn.prepareStatement(REMOVER_PACIENTE);
            stmt.setInt(1, paciente.getId_paciente());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro removido com sucesso");
            conn.commit();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally{
            try{
                if(conn!=null) conn.close();
                if(stmt!=null) stmt.close();
            } catch(Exception ex){
                System.out.println("ERROR (Remover Paciente) - Ao fechar a conexão ou prepared statement");
            }
        }
        return false;
    }
    
    
    
    
    
    public void buscarPaciente(String pesquisa, DefaultTableModel modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Paciente preencherCampos(int codigo) {
        Paciente paciente = null;
        Pessoa pessoa = null;
        Empresa empresa  = null;       
        try {                   
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(PREENCHER_CAMPOS);
            st.setInt(1, codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) { 
                paciente = new Paciente();
                pessoa = new Pessoa();
                empresa = new Empresa();
                //Pessoa
               
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setCep(rs.getString("cep"));
                pessoa.setBairro(rs.getString("bairro"));
                pessoa.setEndereco(rs.getString("endereco"));
                pessoa.setNumero(rs.getInt("numero"));
                pessoa.setCidade(rs.getString("cidade"));
                pessoa.setEstado(rs.getString("estado"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setEmpresa(empresa);
               //Paciente
                paciente.setPessoa(pessoa); 
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setReponsavel(rs.getString("responsavel"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setRg(rs.getString("rg"));
                paciente.setData_nascimento(rs.getDate("data_nascimento"));
                //Empresa
                //empresa.setNome_fantasia(rs.getString("nome_fantasia"));
               
                              
            }
           
          
            FabricaConexao.fecharConexao();                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Buscar Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return paciente;
    }

   /* public void deletarPaciente(int codigo) {
          try {         
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(DELETAR_PACIENTE);
           
            st.setInt(1, codigo);
            
            st.execute();          
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null,"Registro deletado com sucesso", "Editado", 1, new ImageIcon("imagens/ok.png"));
        
        } catch (SQLException ex) {       
            JOptionPane.showMessageDialog(null, "Erro ao Deletar Registro", "Editado", 0, new ImageIcon("imagens/sair.png"));
        }
    } */
    
    public List<Empresa> empresasListaDAO() {
        
             Empresa empresa = null; 
             List<Empresa> lista = new ArrayList<Empresa>();
        try {
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement("SELECT id_empresa, nome_fantasia FROM empresas");          
            ResultSet rs = st.executeQuery();                                 
                while(rs.next()){
                empresa = new Empresa();           
                empresa.setNome_fantasia(rs.getString("nome_fantasia"));
                empresa.setId_empresa(rs.getInt("id_empresa"));
                lista.add(empresa);
                }
                 FabricaConexao.fecharConexao();
                 return lista ;              
        } catch (SQLException ex) {        
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }   
        return null;
       
    }
    
    
     /*private void carregaCombo(){
        //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jComboBoxEmpresa.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Empresa> lista = new ArrayList<Empresa>();
 
        PreparedStatement st;          
        try {
            st = FabricaConexao.getConexao().prepareStatement("SELECT id_empresa, nome_fantasia FROM empresas");
            ResultSet rs = st.executeQuery();                                 
                while(rs.next()){
                empresa = new Empresa(); 
                empresa.setId_empresa(rs.getInt("id_empresa"));
                empresa.setNome_fantasia(rs.getString("nome_fantasia"));
                //empresa.setId_empresa(rs.getInt("id_empresa"));
                lista.add(empresa);
                }
                
         for (int linha = 0; linha < lista.size(); linha++)
        {
            //pegando a categoria da lista
            Empresa empresa = lista.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(empresa);
        }
        } catch (SQLException ex) {
            Logger.getLogger(FrmCadPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        //percorrendo a lista para inserir os valores no combo
        
    }*/
    
    
    
    public Paciente paciente(int id){
        Connection conn = null;
        PreparedStatement stmt = null;
        Paciente paciente = null;
        
        
        ResultSet rs = null;
        try{
            conn =  FabricaConexao.getConexao();
            stmt = conn.prepareStatement(PACIENTE);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            if(rs.next()){
                paciente = new Paciente();
                Pessoa pessoa =  new Pessoa();
                Empresa empresa = new Empresa();
                pessoa.setId_pessoa(7);
                pessoa.setNome(rs.getString(8));
                pessoa.setEmail(rs.getString(9));
                pessoa.setCep(rs.getString(10));
                pessoa.setBairro(rs.getString(11));
                pessoa.setEndereco(rs.getString(12));
                pessoa.setNumero(rs.getInt(13));
                pessoa.setCidade(rs.getString(14));
                pessoa.setEstado(rs.getString(15));
                pessoa.setSexo(rs.getString(16));
                pessoa.setEmpresa(empresa);
               //Paciente
                paciente.setPessoa(pessoa); 
                paciente.setId_paciente(rs.getInt(1));
                paciente.setReponsavel(rs.getString(2));
                paciente.setCpf(rs.getString(3));
                paciente.setRg(rs.getString(4));
                paciente.setData_nascimento(rs.getDate(5));
            }
            return paciente;
        }catch (SQLException  ex) {
            System.out.println(ex);
        } finally{
            try{
                if(conn!=null) conn.close();
                if(stmt!=null) stmt.close();
                if(rs!=null) rs.close();
            } catch(Exception ex){
                System.out.println("ERROR (Buscar Paciente) - Ao fechar a conexão ou prepared statement");
            }
        }
        return null;
    }

    public DefaultTableModel listarPerguntas() {   
        String []  nomesColunas = {"id","Nome","Seleccionado"};
        String [] registros = new String[3];   
           
         DefaultTableModel modelo = new DefaultTableModel(null,nomesColunas);
       
      
        try{                 
            String sql = "SELECT id_questionario, nome FROM questionarios";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(sql);           
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                registros[0] = rs.getString("id_questionario");              
                registros[1] = rs.getString("nome");
                modelo.addRow(registros);               
            }
            return modelo;
        }catch(SQLException e)
        {           
            JOptionPane.showMessageDialog(null,"Error ao conectar");           
        }       
        return null;           
    }

  

    


      
    
}
