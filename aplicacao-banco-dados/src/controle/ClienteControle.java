package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Cliente;

public class ClienteControle {

    public boolean inserir(final Cliente cliente) {
        
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aplicacao_java", "root", "root");
            
            String sql = "INSERT INTO clientes("
                    + "nome, cpfCnpj, telefone, email, dataNascimento) "
                    + "values (?,?,?,?,?)";
            
            PreparedStatement statement= con.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpfCnpj());
            statement.setString(3, cliente.getTelefone());
            statement.setString(4, cliente.getEmail());
            statement.setDate(5, cliente.getDataNascimento());
            
            boolean retorno = statement.execute();
            statement.close();
            con.close();
            
            return retorno;
            
        } catch (SQLException ex) {
            return false;
        }
    }
    
}
