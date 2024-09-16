package com.mycompany.aula2tri3;

/**
 *
 * @author sorti
 */
public class Principal {

    public static void main(String[] args) {
        Lista<Integer> listaInteiros = new Lista<>();

        // ta adicionando os elementos conforme a tabela
        listaInteiros.adicionar(25);
        listaInteiros.adicionar(9);
        listaInteiros.adicionar(5);
        listaInteiros.adicionar(10);
        listaInteiros.adicionar(87);
        listaInteiros.adicionar(96);
        listaInteiros.adicionar(58);
        listaInteiros.adicionar(10);
        listaInteiros.adicionar(21);

        // testando os metodos
        System.out.println("indice da primeira ocorrencia de 10: " + listaInteiros.indiceDe(10)); // 3
        System.out.println("ultimo indice de 10: " + listaInteiros.ultimaPosicaoElemento(10)); // 7

        // removendo o elemento 5
        listaInteiros.remove(5);
        System.out.println("apos remover 5, tamanho da lista: " + listaInteiros.tamanho());

        // verificando se a lista tem o elemento 87
        System.out.println("contem o numero 87? " + listaInteiros.contem(87));

        // imprimindo a lista visualmente
        System.out.println("lista visual:");
        listaInteiros.imprimirListaVisual();

        // limpando a lista
        listaInteiros.limpar();
        System.out.println("a lista esta vazia? " + listaInteiros.estaVazia());
    }

}
