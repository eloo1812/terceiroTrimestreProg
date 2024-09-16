
package exercicios;

/**
 * Classe que representa um jogo de cartas.
 * Implementa os métodos de iniciar, pausar e finalizar o jogo.
 */
public class Exercicio8JogoCarta extends Exercicio8Jogo {

    /**
     * Construtor da classe JogoDeCartas.
     *
     * @param titulo               o título do jogo
     * @param genero               o gênero do jogo
     * @param classificacaoEtaria  a classificação etária do jogo
     */
    public Exercicio8JogoCarta(String titulo, String genero, String classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    /**
     * Inicia o jogo de cartas.
     */
    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo de cartas: " + titulo);
    }

    /**
     * Pausa o jogo de cartas.
     */
    @Override
    public void pausar() {
        System.out.println("Pausando o jogo de cartas: " + titulo);
    }

    /**
     * Finaliza o jogo de cartas.
     */
    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo de cartas: " + titulo);
    }
}

