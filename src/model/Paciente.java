
package model;

import java.util.Date;


public class Paciente {
    
    private Integer id_paciente;
    private String reponsavel;
    private String cpf;
    private String rg;
    private Date data_nascimento;
    private Pessoa pessoa;

    public Paciente() {
    }

    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getReponsavel() {
        return reponsavel;
    }

    public void setReponsavel(String reponsavel) {
        this.reponsavel = reponsavel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
}
