
package exemplo.mysql;
import java.sql.*;

public class ListarDados {
            public static void main(String[] args) {

                try{
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacao2", "programacao2", "123456");
                            System.out.println("conectado");
                            String sql = "SELECT contato_id, nome, email, telefone FROM tb_contato WHERE nome LIKE '%elo'"; 
                            PreparedStatement requisicao = conexao.prepareStatement(sql);
                            ResultSet resultado = requisicao.executeQuery();
                            while(resultado.next()){
                                int idContato = resultado.getInt("contato_id");
                                String nome = resultado.getString("nome");
                                String email = resultado.getString("email");
                                String telefone = resultado.getString("telefone");
                                System.out.println("id:"+idContato);
                                System.out.println("nome:"+nome);
                                System.out.println("email:"+email);
                                System.out.println("telefone:"+telefone);
                            }
                            conexao.close(); 
                    }
                    catch (ClassNotFoundException e) {
                        System.out.println("O driver não foi encontrado!"); 
                    }
                    catch (SQLException e) {
                        System.out.println("Erro ao conectar " + e);
                    }
}
}
