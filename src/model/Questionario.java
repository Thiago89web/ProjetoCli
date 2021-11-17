
package model;


public class Questionario {
    
    private Integer id_questionario;
    private String nome;
    private String descricao;

    public Questionario() {
    }

    public Integer getId_questionario() {
        return id_questionario;
    }

    public void setId_questionario(Integer id_questionario) {
        this.id_questionario = id_questionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  nome;
    }
       
    
}
