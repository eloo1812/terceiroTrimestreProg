
package exercicio;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nmenu:");
            System.out.println("1: incluir paciente");
            System.out.println("2: alterar paciente");
            System.out.println("3: realizar atendimento");
            System.out.println("4: listar pacientes");
            System.out.println("5: mostrar paciente");
            System.out.println("6: apagar paciente");
            System.out.println("7: sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    incluirPaciente(scanner);
                    break;
                case 2:
                    alterarPaciente(scanner);
                    break;
                case 3:
                    realizarAtendimento(scanner);
                    break;
                case 4:
                    listarPacientes();
                    break;
                case 5:
                    mostrarPaciente(scanner);
                    break;
                case 6:
                    apagarPaciente(scanner);
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("opcao inavlida");
            }
        }
    }

    private static void incluirPaciente(Scanner scanner) {
        System.out.println("digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("digite o sobrenome:");
        String sobrenome = scanner.nextLine();
        System.out.println("digite a data de nascimento (dd/MM/yyyy):");
        String dataNascimentoStr = scanner.nextLine();
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatoBr);

        Paciente paciente = new Paciente(nome, sobrenome, dataNascimento);
        pacientes.add(paciente);
        System.out.println("paciente adicionado.");
    }

    private static void alterarPaciente(Scanner scanner) {
        System.out.println("digite o nome do paciente para alterar:");
        String nome = scanner.nextLine();
        Paciente paciente = buscarPaciente(nome);

        if (paciente != null) {
            System.out.println("digite o novo nome:");
            String novoNome = scanner.nextLine();
            paciente.setNome(novoNome);
            System.out.println("nome alterado.");
        } else {
            System.out.println("paciente nao encontrado.");
        }
    }

    private static void realizarAtendimento(Scanner scanner) {
        System.out.println("digite o nome do paciente para o atendimento:");
        String nome = scanner.nextLine();
        Paciente paciente = buscarPaciente(nome);

        if (paciente != null) {
            System.out.println("digite a descrição do atendimento:");
            String descricao = scanner.nextLine();
            LocalDate dataAtual = LocalDate.now();
            Atendimento atendimento = new Atendimento(dataAtual, descricao);
            paciente.adicionarConsulta(atendimento);
            System.out.println("atendimento adicionado.");
        } else {
            System.out.println("paciente nao encontrado.");
        }
    }

    private static void listarPacientes() {
        for (Paciente paciente : pacientes) {
            if (paciente.isAtivo()) {
                System.out.println(paciente.getNome() + " - " + paciente.getIdade() + " anos");
            }
        }
    }

    private static void mostrarPaciente(Scanner scanner) {
        System.out.println("digite o nome do paciente:");
        String nome = scanner.nextLine();
        Paciente paciente = buscarPaciente(nome);

        if (paciente != null) {
            System.out.println(paciente);
        } else {
            System.out.println("paciente nao encontrado.");
        }
    }

    private static void apagarPaciente(Scanner scanner) {
        System.out.println("digite o nome do paciente para apagar:");
        String nome = scanner.nextLine();
        Paciente paciente = buscarPaciente(nome);

        if (paciente != null) {
            paciente.desativar();
            System.out.println("paciente removido.");
        } else {
            System.out.println("paciente nao encontrado.");
        }
    }

    private static Paciente buscarPaciente(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                return paciente;
            }
        }
        return null;
    }
}