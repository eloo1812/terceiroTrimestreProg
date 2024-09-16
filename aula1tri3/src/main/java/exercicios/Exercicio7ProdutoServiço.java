
package exercicios;

/**
 * Classe que representa um produto de serviço.
 * Implementa os métodos de calcular preço final, exibir detalhes e aplicar promoção.
 */
public class Exercicio7ProdutoServiço extends Exercicio7Produto implements Exercicio7Promo {

    private double taxaServico;

    /**
     * Construtor da classe ProdutoServico.
     *
     * @param nome       o nome do produto
     * @param preco      o preço do produto
     * @param categoria  a categoria do produto
     * @param taxaServico a taxa do serviço
     */
    public Exercicio7ProdutoServiço(String nome, double preco, String categoria, double taxaServico) {
        super(nome, preco, categoria);
        this.taxaServico = taxaServico;
    }

    /**
     * Calcula o preço final do serviço, incluindo a taxa de serviço.
     *
     * @return o preço final do serviço
     */
    @Override
    public double calcularPrecoFinal() {
        return preco + taxaServico;
    }

    /**
     * Exibe os detalhes do serviço.
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Serviço: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Categoria: " + categoria);
        System.out.println("Taxa de Serviço: R$" + taxaServico);
    }

    /**
     * Aplica uma promoção no serviço, reduzindo o preço.
     */
    @Override
    public void aplicarPromo() {
        this.preco *= 0.85; // Exemplo de 15% de desconto
    }
}

