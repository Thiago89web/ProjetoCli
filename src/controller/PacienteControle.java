
package controller;

import Utilitarios.Validacao;
import dao.PacienteDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empresa;
import model.Paciente;

      
public class PacienteControle {
    PacienteDAO pacienteDAO;
    
    
    public PacienteControle() {
        pacienteDAO = new PacienteDAO();
        
    }
    
    
    public boolean verificarDados(Paciente paciente) {
      
       if(Validacao.isEmpty(paciente.getPessoa().getNome())) {
           JOptionPane.showMessageDialog(null, "O campo Nome é obrigatório", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
       
       if(Validacao.isEmpty(paciente.getCpf())) {
           JOptionPane.showMessageDialog(null, "O campo CPF é obrigatório", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        } 
       
       if(Validacao.isEmpty(paciente.getRg())) {
           JOptionPane.showMessageDialog(null, "O campo RG é obrigatório", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
                           
       if(!Validacao.CPFisValid(paciente.getCpf())) {
            JOptionPane.showMessageDialog(null, "CPF inválido", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }      
       if(!Validacao.hasOnlyLettersAndNumbers(paciente.getRg())){
           JOptionPane.showMessageDialog(null, "O campo (RG) deve conter apenas números, letras, pontos(.) ou traços (-)", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false; 
        }
       if (paciente.getPessoa().getNumero() == 0) {
            JOptionPane.showMessageDialog(null, "Preencha o número", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }                  
                              
        if (paciente.getPessoa().getEmpresa() == null) {
            JOptionPane.showMessageDialog(null, "Informe a empresa", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
     
        
        pacienteDAO.cadastrarPaciente(paciente);
        return true;
    }
    
        
    
    public void controlePesquisa(String pesquisa, DefaultTableModel modelo) {
        pacienteDAO.buscarPaciente(pesquisa, modelo);
    }

    public Paciente controlePreencherCampos(int codigo) {
        return pacienteDAO.preencherCampos(codigo);
    }
    
    public void controleListaPaciente(DefaultTableModel modelo) {        
        pacienteDAO.listarPaciente(modelo);
    }
  
    public boolean verificarDadosEditar(Paciente paciente) {
        if (paciente.getReponsavel().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Nome do Responsável", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        
       if (paciente.getPessoa().getEmpresa() == null) {
            JOptionPane.showMessageDialog(null, "Informe a empresa", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }        
        pacienteDAO.editarPaciente(paciente);
        return true;
        
    }

    public boolean controleRemoverPaciente(Paciente cliente){               
        return pacienteDAO.deletarPaciente(cliente);
    }
     
    /*public boolean controleDeletarPaciente(int codigo) {//recebe do form        
        if (codigo == 0) {        
            JOptionPane.showMessageDialog(null, "Informe a linha da Tabela!", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }         
         pacienteDAO.deletarPaciente(codigo);//manda para o dão
          return true;
    }*/
    
    public List<Empresa> empresaListaCombox() {
       return pacienteDAO.empresasListaDAO();
    }
    
     public DefaultTableModel PacienteControleListarPergunta() {        
       return pacienteDAO.listarPerguntas();
       
    }

   

   
}