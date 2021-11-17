/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Utilitarios.FabricaConexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Questionario;


public class QuestionarioDAO {
    
    public QuestionarioDAO() {
    }
    
    private static final String LISTARQUESTIONARIO = "select * from questionarios order by id_questionario desc limit 15";
    private static final String CADASTRARQUESTIONARIO = "insert into questionarios(nome, descricao) values( ?, ?)";
    
    public void cadastrarQuestionario(Questionario questionario) {
        try {            
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(CADASTRARQUESTIONARIO);
            st.setString(1, questionario.getNome());
            st.setString(2, questionario.getDescricao());
            
            st.execute();
            //FabricaConexao.getConexao().commit();
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso", "Salvo", 1, new ImageIcon("Imagens/ok.png"));
        } catch (SQLException ex) {            
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar Registro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }

    public void editarQuestionario(Questionario questionario) {
        try {
            String SQLIsertion = "UPDATE questionarios SET nome = ?, descricao = ? WHERE id_questionario = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            st.setString(1, questionario.getNome());
            st.setString(2, questionario.getDescricao());        
            st.setInt(3, questionario.getId_questionario());

            st.execute();         
            //FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null, "Registro editado com sucesso", "Editado", 1, new ImageIcon("imagens/ok.png"));
        } catch (SQLException ex) {          
            JOptionPane.showMessageDialog(null, "Erro ao Editar Registro", "Editado", 0, new ImageIcon("imagens/sair.png"));
        }
    }

    public Questionario preencherCampos(int codigo) {
        Questionario questionario = new Questionario();

        try {
            String SQLSelection = "select * from questionarios where id_questionario = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLSelection);
            st.setInt(1, codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                questionario.setId_questionario(rs.getInt("id_questionario"));
                questionario.setNome(rs.getString("nome"));
                questionario.setDescricao(rs.getString("descricao"));               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Item", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return questionario;
    }

    public void deletarQuestionario(int codigo) {
        try {
            String SQLIsertion = "delete from questionarios where id_questionario = ?";
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(SQLIsertion);
            st.setInt(1, codigo);
            
            st.execute();           
            FabricaConexao.fecharConexao();
            JOptionPane.showMessageDialog(null,"Registro deletado com sucesso", "Editado", 1, new ImageIcon("imagens/ok.png"));       
        } catch (SQLException ex) {          
            JOptionPane.showMessageDialog(null, "Erro ao Deletar Registro", "Editado", 0, new ImageIcon("imagens/sair.png"));
        }
    }

    public void listarQuestionario(DefaultTableModel modelo) {
        try {          
            PreparedStatement st = FabricaConexao.getConexao().prepareStatement(LISTARQUESTIONARIO);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {               
                modelo.addRow(new Object[]{
                    rs.getString("id_questionario"), 
                    rs.getString("nome"), 
                    rs.getString("descricao"),                                            
                });               
            }
        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
    }

    public void buscarQuestionario(String pesquisa, DefaultTableModel tableModel) {
        try {
            String SQLSelection = "select * from questionarios where nome like '%" + pesquisa + "%' ";
            PreparedStatement stm = FabricaConexao.getConexao().prepareStatement(SQLSelection);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getString("id_questionario"), rs.getString("nome"), rs.getString("descricao")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Item", "Erro", 0, new ImageIcon("imagens/sair.png"));
        }
    }
    
    
    
}
