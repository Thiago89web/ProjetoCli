
package dao;

import Utilitarios.FabricaConexao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empresa;


public class EmpresaDAO {

    public EmpresaDAO() {
    }
    
    public void listarEmpresa(DefaultTableModel modelo) {       
        try {
            String SQLPesquisa = "select * from empresas order by id_empresa desc limit 15";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLPesquisa);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                modelo.addRow(new Object[]{
                rs.getInt("id_empresa"),
                rs.getString("responsavel_emp"), 
                rs.getString("razao_social"), 
                rs.getString("nome_fantasia"), 
                rs.getString("cnpj"),
                rs.getString("telefone_emp"),
                rs.getString("endereco_emp"),               
                rs.getString("uf_emp"),
                rs.getString("cidade_emp"),
                rs.getString("email_emp")               
                });
                
            }
        } catch (SQLException ex) {        
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
    }

    public void cadastrarEmpresa(Empresa empresa) {
        try {
            String SQLIsertion = "insert into empresas(responsavel_emp, razao_social, nome_fantasia, "
                    + "cnpj, telefone_emp, endereco_emp, uf_emp, cidade_emp, email_emp) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            st.setString(1, empresa.getResponsavel_emp());
            st.setString(2, empresa.getRazao_social());
            st.setString(3, empresa.getNome_fantasia());
            st.setString(4, empresa.getCnpj());
            st.setString(5, empresa.getTelefone_emp());        
            st.setString(6, empresa.getEndereco_emp());           
            st.setString(7, empresa.getUf_emp());
            st.setString(8, empresa.getCidade_emp());
            st.setString(9, empresa.getEmail_emp());

            st.execute();           
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public void buscarEmpresa(String pesquisa, DefaultTableModel modelo) {

        try {
            String SQLSelection = "select * from empresas where nome_fantasia like '%" + pesquisa + "%' ";
            PreparedStatement stm = FabricaConexao.getConexao().prepareStatement(SQLSelection);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
               
                modelo.addRow(new Object[]{
                rs.getInt("id_empresa"),
                rs.getString("responsavel_emp"),
                rs.getString("razao_social"), 
                rs.getString("nome_fantasia"), 
                rs.getString("cnpj"),
                rs.getString("telefone_emp"),              
                rs.getString("endereco_emp"),
                rs.getString("uf_emp"),
                rs.getString("cidade_emp"),
                rs.getString("email_emp")
                
                });

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Item", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
    }

    public Empresa preencherCampos(int codigo) {
        Empresa empresa = new Empresa();

        try {
            String SQLSelection = "select * from empresas where id_empresa = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLSelection);
            st.setInt(1, codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                empresa.setId_empresa(rs.getInt("id_empresa"));
                empresa.setResponsavel_emp(rs.getString("responsavel_emp"));
                empresa.setRazao_social(rs.getString("razao_social"));
                empresa.setNome_fantasia(rs.getString("nome_fantasia"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setTelefone_emp(rs.getString("telefone_emp"));          
                empresa.setEndereco_emp(rs.getString("endereco_emp"));
                empresa.setUf_emp(rs.getString("uf_emp"));
                empresa.setCidade_emp(rs.getString("cidade_emp"));
                empresa.setEmail_emp(rs.getString("email_emp"));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return empresa;
    }    

    public void editarEmpresa(Empresa empresa) {
        try {
            String SQLIsertion = "update empresas set responsavel_emp = ?, razao_social = ?, nome_fantasia = ?, cnpj = ?, "
            +" telefone_emp = ?, endereco_emp = ?, uf_emp = ?, cidade_emp = ?, email_emp = ? where id_empresa = ?";   
            
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            
            st.setString(1, empresa.getResponsavel_emp());
            st.setString(2, empresa.getRazao_social());
            st.setString(3, empresa.getNome_fantasia());
            st.setString(4, empresa.getCnpj());
            st.setString(5, empresa.getTelefone_emp());
            st.setString(6, empresa.getEndereco_emp());           
            st.setString(7, empresa.getUf_emp());
            st.setString(8, empresa.getCidade_emp());
            st.setString(9, empresa.getEmail_emp());
            st.setInt(10, empresa.getId_empresa());

            st.execute();         
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null,"Registro editado com sucesso", "Editado", 1, new ImageIcon("imagens/ok.png"));

        } catch (SQLException ex) {         
            JOptionPane.showMessageDialog(null,"Erro ao Editar Registro", "Editado", 0, new ImageIcon("imagens/sair.png"));
        }
    }
     
    public void deletarEmpresa(int codigo) {     
        try {
            String SQLIsertion = "delete from empresas where id_empresa = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            
            st.setInt(1, codigo);
            
            st.execute();          
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null,"Registro deletado com sucesso", "Editado", 1, new ImageIcon("imagens/ok.png"));
        
        } catch (SQLException ex) {       
            JOptionPane.showMessageDialog(null, "Erro ao Deletar Registro", "Editado", 0, new ImageIcon("imagens/sair.png"));
        }
    }

   /* List<Empresa> listarEmpresaCombox(EmpresaDAO tdao) {
        List<Empresa> lista = new ArrayList();
        try {
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement("SELECT id_empresa, nome_fantasia FROM empresas");
           
           
            ResultSet rs = st.executeQuery();         
          
                
                while(rs.next()){
                Empresa empresa = new Empresa();           
                empresa.setNome_fantasia(rs.getString("nome_fantasia"));
                empresa.setId_empresa(rs.getInt("id_empresa")); 
                lista.add(empresa);
                }
                
                     
                FabricaConexao.fecharConexao();
        } catch (SQLException ex) {        
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
        
        return lista ;
            
    }*/
    
    
    
    
}
