
package exemplo.mysql;

import java.sql.*;
import java.util.Scanner;


public class InserindoDados {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacao2", "programacao2", "123456");
                System.out.println("conectado");
                String sql = "INSERT INTO tb_contato(nome, email, telefone) VALUES(?, ?, ?)";
            PreparedStatement requisicao = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            System.out.println("Qual o nome do novo contato?");
            String nome = ler.next();
            System.out.println("Qual o e-mail do contato?");
            String email = ler.next();
            System.out.println("Qual o telefone do contato?");
            String telefone = ler.next();

            requisicao.setString(1, nome);
            requisicao.setString(2, email);
            requisicao.setString(3, telefone);
            requisicao.execute();
            ResultSet resultado = requisicao.getGeneratedKeys();
            if(resultado.next()){
                int idContato = resultado.getInt(1);
                System.out.println("Qcontato"+nome+"gravado, obteve o id "+idContato);

            }

            conexao.close(); //não obrigatório mas em algum momento temos que encerrar.
        }
        catch (ClassNotFoundException e) {
            System.out.println("O driver não foi encontrado!"); //Exceção obrigatória.
        }
        catch (SQLException e) {
            System.out.println("Erro ao conectar " + e);
        }
        
        }
}
