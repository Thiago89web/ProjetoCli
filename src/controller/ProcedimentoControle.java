package controller;

import dao.ProcedimentoDAO;
import model.Procedimentos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProcedimentoControle {

    ProcedimentoDAO procedimentoD;

    public ProcedimentoControle() {
        procedimentoD = new ProcedimentoDAO();
    }

    public boolean verificarDados(Procedimentos procedimentos) {
        if (procedimentos.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (procedimentos.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descricao", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (procedimentos.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Informe o Valor", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        
        procedimentoD.cadastrarProcedimento(procedimentos);
        return true;
    }

    public void controlePesquisa(String pesquisa, DefaultTableModel modelo) {
        procedimentoD.buscarProcedimento(pesquisa, modelo);
    }

    public Procedimentos controlePreencherCampos(int codigo) {
        return procedimentoD.preencherCampos(codigo);
    }
    
    public void controleListaProcedomento(DefaultTableModel modelo) {
        procedimentoD.listarProcedimento(modelo);

    }
  
    public boolean verificarDadosEditar(Procedimentos procedimentos) {
        
        if (procedimentos.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (procedimentos.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (procedimentos.getValor() == null) {
            JOptionPane.showMessageDialog(null, "Informe o Valor", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        

        procedimentoD.editarProcedimento(procedimentos);
        return true;
    }    
  
    
    public boolean ControleProcedimentoDeletar(int codigo) {    //recebe do form        
        if (codigo == 0) {        
            JOptionPane.showMessageDialog(null, "Informe a linha da Tabela!", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }         
         procedimentoD.deletarProcedimento(codigo);     //manda para o dão
          return true;
    }
      
}
