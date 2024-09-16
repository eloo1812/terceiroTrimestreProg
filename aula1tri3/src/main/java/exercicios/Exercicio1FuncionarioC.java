
package exercicios;
/**
 * Classe que representa um funcionário comissionado.
 * O salário é composto pelo salário base mais uma comissão sobre as vendas.
 */


public class Exercicio1FuncionarioC extends Exercicio1Funcionario implements Exercicio1Pagamento {

    

    private double totalVendas;
    private double percentualComissao;

    /**
     * Construtor da classe FuncionarioComissionado.
     *
     * @param nome               o nome do funcionário
     * @param salarioBase        o salário base do funcionário
     * @param totalVendas        o total de vendas do funcionário
     * @param percentualComissao o percentual de comissão sobre as vendas
     */
    public Exercicio1FuncionarioC(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    /**
     * Calcula o salário do funcionário comissionado.
     * O salário é composto pelo salário base mais uma comissão sobre as vendas.
     *
     * @return o salário calculado
     */
    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * percentualComissao);
    }

    /**
     * Processa o pagamento do funcionário comissionado.
     *
     * @return o valor do pagamento processado
     */
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}
