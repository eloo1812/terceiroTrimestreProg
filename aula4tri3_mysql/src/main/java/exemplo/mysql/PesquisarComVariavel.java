package exemplo.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PesquisarComVariavel{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacao2", "programacao2", "123456");
            System.out.println("Conectado");

            boolean continuar = true;
            while (continuar) {
                System.out.println("\nEscolha uma operação: ");
                System.out.println("1 - Pesquisar");
                System.out.println("2 - Editar");
                System.out.println("3 - Deletar");
                System.out.println("4 - Sair");
                int opcao = ler.nextInt();
                ler.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1: // Pesquisar
                        System.out.println("Digite o campo para pesquisa (nome, email, telefone): ");
                        String campo = ler.nextLine();
                        System.out.println("Digite o termo para pesquisa: ");
                        String termo = ler.nextLine();
                        pesquisar(conexao, campo, termo);
                        break;

                    case 2: // Editar
                        System.out.println("Digite o ID do contato para editar: ");
                        int idContato = ler.nextInt();
                        ler.nextLine(); // Consumir a quebra de linha

                        System.out.println("Digite o novo nome: ");
                        String nome = ler.nextLine();
                        System.out.println("Digite o novo email: ");
                        String email = ler.nextLine();
                        System.out.println("Digite o novo telefone: ");
                        String telefone = ler.nextLine();
                        editar(conexao, idContato, nome, email, telefone);
                        break;

                    case 3: // Deletar
                        System.out.println("Digite o ID do contato para deletar: ");
                        int idParaDeletar = ler.nextInt();
                        ler.nextLine(); // Consumir a quebra de linha
                        deletar(conexao, idParaDeletar);
                        break;

                    case 4: // Sair
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }

            conexao.close(); // Encerra a conexão
            System.out.println("Conexão encerrada.");
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi encontrado!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e);
        }
    }

    public static void pesquisar(Connection conexao, String campo, String termo) throws SQLException {
        String sql = "SELECT contato_id, nome, email, telefone FROM tb_contato WHERE " + campo + " LIKE ?";
        PreparedStatement requisicao = conexao.prepareStatement(sql);
        requisicao.setString(1, "%" + termo + "%");
        ResultSet resultado = requisicao.executeQuery();
        boolean found = false;

        while (resultado.next()) {
            int idContato = resultado.getInt("contato_id");
            String nome = resultado.getString("nome");
            String email = resultado.getString("email");
            String telefone = resultado.getString("telefone");

            System.out.println("\nID: " + idContato);
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Telefone: " + telefone);

            found = true;
        }

        if (!found) {
            System.out.println("O termo " + termo + " não retornou resultado.");
        }
    }

    public static void editar(Connection conexao, int idContato, String nome, String email, String telefone) throws SQLException {
        String sql = "UPDATE tb_contato SET nome = ?, email = ?, telefone = ? WHERE contato_id = ?";
        PreparedStatement requisicao = conexao.prepareStatement(sql);
        requisicao.setString(1, nome);
        requisicao.setString(2, email);
        requisicao.setString(3, telefone);
        requisicao.setInt(4, idContato);

        int rowsAffected = requisicao.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Contato atualizado com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public static void deletar(Connection conexao, int idContato) throws SQLException {
        String sql = "DELETE FROM tb_contato WHERE contato_id = ?";
        PreparedStatement requisicao = conexao.prepareStatement(sql);
        requisicao.setInt(1, idContato);

        int rowsAffected = requisicao.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Contato deletado com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
