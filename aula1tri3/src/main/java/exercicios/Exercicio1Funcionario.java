package exercicios;
/**
 * Classe abstrata que representa um funcionário.
 * Possui atributos comuns a todos os tipos de funcionários
 * e define um método abstrato para cálculo do salário.
 */

public abstract class Exercicio1Funcionario {


    protected String nome;
    protected double salarioBase;

    /**
     * Construtor da classe Funcionario.
     *
     * @param nome        o nome do funcionário
     * @param salarioBase o salário base do funcionário
     */
    public Exercicio1Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstrato para calcular o salário do funcionário.
     * Deve ser implementado por todas as subclasses.
     *
     * @return o salário calculado
     */
    public abstract double calcularSalario();

    /**
     * Retorna o nome do funcionário.
     *
     * @return o nome do funcionário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o salário base do funcionário.
     *
     * @return o salário base do funcionário
     */
    public double getSalarioBase() {
        return salarioBase;
    }
}
