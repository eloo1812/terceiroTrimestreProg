
package exercicios;
    
/**
 * Classe abstrata que representa um jogo na biblioteca de jogos.
 * Contém atributos e métodos comuns para todos os tipos de jogos.
 */
public abstract class Exercicio8Jogo {

    protected String titulo;
    protected String genero;
    protected String classificacaoEtaria;

    /**
     * Construtor da classe Jogo.
     *
     * @param titulo           o título do jogo
     * @param genero           o gênero do jogo
     * @param classificacaoEtaria a classificação etária do jogo
     */
    public Exercicio8Jogo(String titulo, String genero, String classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    /**
     * Método abstrato para iniciar o jogo.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void iniciar();

    /**
     * Método abstrato para pausar o jogo.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void pausar();

    /**
     * Método abstrato para finalizar o jogo.
     * Deve ser implementado por todas as subclasses.
     */
    public abstract void finalizar();

    /**
     * Retorna o título do jogo.
     *
     * @return o título do jogo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o gênero do jogo.
     *
     * @return o gênero do jogo
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Retorna a classificação etária do jogo.
     *
     * @return a classificação etária do jogo
     */
    public String getClassificacaoEtaria() {
        return classificacaoEtaria;
    }
}

