
package controller;

import dao.QuestionarioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Questionario;

public class QuestionarioControle {
    QuestionarioDAO questionarioDAO;
    
    public QuestionarioControle() {
        questionarioDAO = new QuestionarioDAO();
    }
       
    public boolean verificarDados(Questionario questionario) {
       if (questionario.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
       if (questionario.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        questionarioDAO.cadastrarQuestionario(questionario);
        return true;
    }

    public boolean verificarDadosEditar(Questionario questionario) {
     if (questionario.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        questionarioDAO.editarQuestionario(questionario);
        return true;       
    }

    public Questionario controlePreencherCampos(int codigo) {
       return questionarioDAO.preencherCampos(codigo);
    }

    public boolean ControleQuestionarioDeletar(int codigo) {
        if (codigo == 0) {        
            JOptionPane.showMessageDialog(null, "Informe a linha da Tabela!", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }         
         questionarioDAO.deletarQuestionario(codigo); 
          return true;
    }

    public void controleListaQuestionario(DefaultTableModel tableModel) {      
        questionarioDAO.listarQuestionario(tableModel);
    }

    public void controlePesquisa(String pesquisa, DefaultTableModel tableModel) {
        questionarioDAO.buscarQuestionario(pesquisa, tableModel);
    }
    
}
