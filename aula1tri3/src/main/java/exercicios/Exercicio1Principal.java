
package exercicios;


public class Exercicio1Principal {
    

    public static void main(String[] args) {
        Exercicio1Funcionario mensalista = new Exercicio1FuncionarioM("João", 3000);
        Exercicio1Funcionario horista = new ExercicioFuncionarioH("Maria", 0, 160, 25);
        Exercicio1Funcionario comissionado = new Exercicio1FuncionarioC("Carlos", 2000, 15000, 0.10);

        System.out.println("Salário Mensalista: " + mensalista.calcularSalario());
        System.out.println("Salário Horista: " + horista.calcularSalario());
        System.out.println("Salário Comissionado: " + comissionado.calcularSalario());

        System.out.println("Pagamento Mensalista: " + ((Exercicio1Pagamento) mensalista).processarPagamento());
        System.out.println("Pagamento Horista: " + ((Exercicio1Pagamento) horista).processarPagamento());
        System.out.println("Pagamento Comissionado: " + ((Exercicio1Pagamento) comissionado).processarPagamento());
    }
}

