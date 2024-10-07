
package exemplo.mysql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class Conectar {
        public static void main(String[] args) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacao2", "programacao2", "123456");
                System.out.println("conectado");
                conexao.close();

            }
            catch (ClassNotFoundException e){
                        System.out.println("driver nao encontrado");

            }
            catch (SQLException e){
            System.out.println("erro ao encontrar"+e);

            }
        }
}
