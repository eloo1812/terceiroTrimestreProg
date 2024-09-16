
package exercicios;

/**
 * Classe que representa um jogo de tabuleiro.
 * Implementa os métodos de iniciar, pausar e finalizar o jogo.
 */
public class Exercicio8JogoTabuleiro extends Exercicio8Jogo {

    /**
     * Construtor da classe JogoDeTabuleiro.
     *
     * @param titulo               o título do jogo
     * @param genero               o gênero do jogo
     * @param classificacaoEtaria  a classificação etária do jogo
     */
    public Exercicio8JogoTabuleiro(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    /**
     * Inicia o jogo de tabuleiro.
     */
    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo de tabuleiro: " + titulo);
    }

    /**
     * Pausa o jogo de tabuleiro.
     */
    @Override
    public void pausar() {
        System.out.println("Pausando o jogo de tabuleiro: " + titulo);
    }

    /**
     * Finaliza o jogo de tabuleiro.
     */
    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo de tabuleiro: " + titulo);
    }
}

