
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Pessoa;

public class PessoaDAO {
    
    private final static String CADASTRAR_PESSOA = "INSERT INTO pessoas( nome, email, cep, bairro, "
    + "endereco, numero, cidade, estado, sexo, id_empresa) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private final static String EDITAR_PESSOA = "UPDATE pessoas SET nome = ?, email = ?, cep = ?, bairro = ?, "
    + "endereco = ?, numero = ?, cidade = ?, estado = ?, sexo = ?, id_empresa = ? WHERE id_pessoa = ?";
    private final static String REMOVER_PESSOA = "DELETE FROM pessoas WHERE id_pessoa = ?";
    
       

    int cadastrar(Connection conn, PreparedStatement stmpe, ResultSet rs, Pessoa pessoa) throws SQLException{       
        stmpe = conn.prepareStatement(CADASTRAR_PESSOA, PreparedStatement.RETURN_GENERATED_KEYS);
        stmpe.setString(1, pessoa.getNome());
        stmpe.setString(2, pessoa.getEmail());
        stmpe.setString(3, pessoa.getCep());
        stmpe.setString(4, pessoa.getBairro());
        stmpe.setString(5, pessoa.getEndereco());
        stmpe.setInt(6, pessoa.getNumero());
        stmpe.setString(7, pessoa.getCidade());
        stmpe.setString(8, pessoa.getEstado());
        stmpe.setString(9, pessoa.getSexo());
        stmpe.setInt(10, pessoa.getEmpresa().getId_empresa());
      
        stmpe.executeUpdate();
        rs = stmpe.getGeneratedKeys();
        if(rs.next())
            return rs.getInt(1);
        return 0;
    }
    
    public int editar(Connection conn, PreparedStatement stmpe, Pessoa pessoa) throws SQLException {
        stmpe = conn.prepareStatement(EDITAR_PESSOA);
        stmpe.setString(1, pessoa.getNome());
        stmpe.setString(2, pessoa.getEmail());
        stmpe.setString(3, pessoa.getCep());
        stmpe.setString(4, pessoa.getBairro());
        stmpe.setString(5, pessoa.getEndereco());
        stmpe.setInt(6, pessoa.getNumero());
        stmpe.setString(7, pessoa.getCidade());
        stmpe.setString(8, pessoa.getEstado());
        stmpe.setString(9, pessoa.getSexo());    
        stmpe.setInt(10, pessoa.getEmpresa().getId_empresa());
        stmpe.setInt(11, pessoa.getId_pessoa());
        stmpe.executeUpdate();
        return pessoa.getId_pessoa();
    }
    
    public void remover(Connection conn, PreparedStatement stmpe, int id_pessoa) throws SQLException {
        stmpe = conn.prepareStatement(REMOVER_PESSOA);
        stmpe.setInt(1,id_pessoa);
        stmpe.executeUpdate();
    }
                     
}
