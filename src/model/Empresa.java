
package model;

import dao.EmpresaDAO;



public class Empresa {
    private Integer id_empresa;
    private String responsavel_emp, razao_social, nome_fantasia, cnpj, telefone_emp, 
    endereco_emp, uf_emp, cidade_emp, email_emp;
    
  
    public Empresa() {
        
    }

    public Integer getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getResponsavel_emp() {
        return responsavel_emp;
    }

    public void setResponsavel_emp(String responsavel_emp) {
        this.responsavel_emp = responsavel_emp;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone_emp() {
        return telefone_emp;
    }

    public void setTelefone_emp(String telefone_emp) {
        this.telefone_emp = telefone_emp;
    }

    public String getEndereco_emp() {
        return endereco_emp;
    }

    public void setEndereco_emp(String endereco_emp) {
        this.endereco_emp = endereco_emp;
    }

    public String getUf_emp() {
        return uf_emp;
    }

    public void setUf_emp(String uf_emp) {
        this.uf_emp = uf_emp;
    }

    public String getCidade_emp() {
        return cidade_emp;
    }

    public void setCidade_emp(String cidade_emp) {
        this.cidade_emp = cidade_emp;
    }

    public String getEmail_emp() {
        return email_emp;
    }

    public void setEmail_emp(String email_emp) {
        this.email_emp = email_emp;
    }

    @Override
    public String toString() {
        return  nome_fantasia;
    }

   
    
    
 
   
 
}
