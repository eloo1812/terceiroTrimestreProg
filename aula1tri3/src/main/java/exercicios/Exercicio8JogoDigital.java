
package exercicios;
    
/**
 * Classe que representa um jogo digital.
 * Implementa os métodos de iniciar, pausar e finalizar o jogo,
 * além de gerenciar a conexão de múltiplos jogadores.
 */
public class Exercicio8JogoDigital extends Exercicio8Jogo implements Exercicio8Multiplayer {

    private int numeroMaximoJogadores;

    /**
     * Construtor da classe JogoDigital.
     *
     * @param titulo               o título do jogo
     * @param genero               o gênero do jogo
     * @param classificacaoEtaria  a classificação etária do jogo
     * @param numeroMaximoJogadores o número máximo de jogadores
     */
    public Exercicio8JogoDigital(String titulo, String genero, String classificacaoEtaria, int numeroMaximoJogadores) {
        super(titulo, genero, classificacaoEtaria);
        this.numeroMaximoJogadores = numeroMaximoJogadores;
    }

    /**
     * Inicia o jogo digital.
     */
    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo digital: " + titulo);
    }

    /**
     * Pausa o jogo digital.
     */
    @Override
    public void pausar() {
        System.out.println("Pausando o jogo digital: " + titulo);
    }

    /**
     * Finaliza o jogo digital.
     */
    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo digital: " + titulo);
    }

    /**
     * Conecta múltiplos jogadores em um jogo digital.
     */
    @Override
    public void conectarJogadores() {
        System.out.println("Conectando até " + numeroMaximoJogadores + " jogadores no jogo digital: " + titulo);
    }

    /**
     * Retorna o número máximo de jogadores.
     *
     * @return o número máximo de jogadores
     */
    public int getNumeroMaximoJogadores() {
        return numeroMaximoJogadores;
    }
}

