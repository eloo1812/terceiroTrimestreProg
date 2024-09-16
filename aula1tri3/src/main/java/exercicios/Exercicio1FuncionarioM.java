
package exercicios;

/**
 * Classe que representa um funcionário mensalista.
 * O salário é fixo, baseado no salário base.
 */
public class Exercicio1FuncionarioM extends Exercicio1Funcionario implements Exercicio1Pagamento{
    
    /**
     * Construtor da classe FuncionarioMensalista.
     *
     * @param nome        o nome do funcionário
     * @param salarioBase o salário base do funcionário
     */
    public Exercicio1FuncionarioM(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário do funcionário mensalista.
     * O salário é igual ao salário base.
     *
     * @return o salário calculado
     */
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Processa o pagamento do funcionário mensalista.
     *
     * @return o valor do pagamento processado
     */
    @Override
    public double processarPagamento() {
        return calcularSalario();
    }
}
