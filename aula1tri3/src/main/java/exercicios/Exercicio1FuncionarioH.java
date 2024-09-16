
package exercicios;
/**
 * Classe que representa um funcionário horista.
 * O salário é calculado com base nas horas trabalhadas e na taxa por hora.
 */

public class Exercicio1FuncionarioH extends Exercicio1Funcionario implements Exercicio1Pagamento{
    
    

    private double horasTrabalhadas;
    private double taxaPorHora;

    /**
     * Construtor da classe FuncionarioHorista.
     *
     * @param nome           o nome do funcionário
     * @param salarioBase    o salário base do funcionário
     * @param horasTrabalhadas o número de horas trabalhadas pelo funcionário
     * @param taxaPorHora    a taxa por hora do funcionário
     */
    public Exercicio1FuncionarioH(String nome, double salarioBase, double horasTrabalhadas, double taxaPorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    /**
     * Calcula o salário do funcionário horista.
     * O salário é calculado com base nas horas trabalhadas e na taxa por hora.
     *
     * @return o salário calculado
     */
    @Override
    public double calcularSalario() {
        return horasTrabalhadas * taxaPorHora;
    }

    /**
     * Processa o pagamento do funcionário horista.
     *
     * @return o valor do pagamento processado
     */
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}
