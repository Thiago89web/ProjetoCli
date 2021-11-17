package dao;


import Utilitarios.FabricaConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Procedimentos;

public class ProcedimentoDAO {

    public ProcedimentoDAO() {

    }
    
    public void listarProcedimento(DefaultTableModel modelo) {
        
        try {
            String SQLPesquisa = "select * from procedimentos order by id_procedimento desc limit 15";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLPesquisa);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                
                modelo.addRow(new Object[]{
                    rs.getString("id_procedimento"), 
                    rs.getString("nome"), 
                    rs.getString("descricao"), 
                    rs.getDouble("valor")
                        
                });
                
            }
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
    }

    public void cadastrarProcedimento(Procedimentos procedimentos) {
        try {
            String SQLIsertion = "insert into procedimentos(nome, descricao, valor) values(?, ?, ?)";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            st.setString(1, procedimentos.getNome());
            st.setString(2, procedimentos.getDescricao());
            st.setDouble(3, procedimentos.getValor());

            st.execute();
            //FabricaConexao.getConexao().commit();
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public void buscarProcedimento(String pesquisa, DefaultTableModel modelo) {

        try {
            String SQLSelection = "select * from procedimentos where nome like '%" + pesquisa + "%' ";
            PreparedStatement stm = FabricaConexao.getConexao().prepareStatement(SQLSelection);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("id_procedimento"), rs.getString("nome"), rs.getString("descricao"), rs.getDouble("valor")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Item", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
    }

    public Procedimentos preencherCampos(int codigo) {
        Procedimentos procedimento = new Procedimentos();

        try {
            String SQLSelection = "select * from procedimentos where id_procedimento = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLSelection);
            st.setInt(1, codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                procedimento.setId_procedimento(rs.getInt("id_procedimento"));
                procedimento.setNome(rs.getString("nome"));
                procedimento.setDescricao(rs.getString("descricao"));
                procedimento.setValor(rs.getDouble("valor"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return procedimento;
    }
     

    public void editarProcedimento(Procedimentos procedimento) {
        try {
            String SQLIsertion = "UPDATE procedimentos SET nome = ?, descricao = ?, valor = ? WHERE id_procedimento = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            st.setString(1, procedimento.getNome());
            st.setString(2, procedimento.getDescricao());
            st.setDouble(3, procedimento.getValor());
            st.setInt(4, procedimento.getId_procedimento());

            st.execute();
         
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null, "Registro editado com sucesso", "Editado", 1, new ImageIcon("imagens/ok.png"));

        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "Erro ao Editar Registro", "Editado", 0, new ImageIcon("imagens/sair.png"));
        }
    }
     
    public void deletarProcedimento(int codigo) {
        //Procedimentos procedimento = new Procedimentos();
        try {
            String SQLIsertion = "delete from procedimentos where id_procedimento = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            st.setInt(1, codigo);
            
            st.execute();
           
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null,"Registro deletado com sucesso", "Editado", 1, new ImageIcon("imagens/ok.png"));
        
        } catch (SQLException ex) {
          
            JOptionPane.showMessageDialog(null, "Erro ao Deletar Registro", "Editado", 0, new ImageIcon("imagens/sair.png"));
        }

    } 

}
