
package controller;

import dao.EmpresaDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empresa;


public class EmpresaControle {

    EmpresaDAO empresaDAO;
    
    public EmpresaControle() {
        empresaDAO = new EmpresaDAO();
    }
    
    
    public boolean verificarDados(Empresa empresa) {
        if (empresa.getResponsavel_emp().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Nome do Responsável", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        
        if (empresa.getRazao_social().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Razão Social", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (empresa.getNome_fantasia().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Nome Fantasia", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (empresa.getCnpj().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CNPJ", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        
        empresaDAO.cadastrarEmpresa(empresa);

        return true;
    }

    public void controlePesquisa(String pesquisa, DefaultTableModel modelo) {
        empresaDAO.buscarEmpresa(pesquisa, modelo);
    }

    public Empresa controlePreencherCampos(int codigo) {
        return empresaDAO.preencherCampos(codigo);
    }
    
    public void controleListarEmpresa(DefaultTableModel modelo) {
        empresaDAO.listarEmpresa(modelo);

    }
  
    public boolean verificarDadosEditar(Empresa empresa) {
        
        if (empresa.getResponsavel_emp().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Razão Social", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        
        if (empresa.getRazao_social().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Razão Social", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (empresa.getNome_fantasia().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome Fantasia", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }

        if (empresa.getCnpj().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o CNPJ", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }
        

        empresaDAO.editarEmpresa(empresa);
        return true;
    }    
     
    public boolean ControleDeletarEmpresa(int codigo) {//recebe do form        
        if (codigo == 0) {        
            JOptionPane.showMessageDialog(null, "Informe a linha da Tabela!", "Erro", 0, new ImageIcon("imagens/sair.png"));
            return false;
        }         
         empresaDAO.deletarEmpresa(codigo);//manda para o dão
          return true;
    }
    
    
    
    
}
