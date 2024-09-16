package com.mycompany.aula2tri3;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> {
    private List<T> lista;

    // construtor que permite omitir o tamanho e constroi uma lista com 10 elementos
    public Lista() {
        this.lista = new ArrayList<>(10);
    }

    // construtor que permite passar o tamanho da lista
    public Lista(int tamanho) {
        this.lista = new ArrayList<>(tamanho);
    }

    // metodo que pesquisa e diz se existe ou nao o elemento na lista
    public boolean contem(T elemento) {
        return lista.contains(elemento);
    }

    // metodo que remove o elemento da lista e retorna se a remocao foi bem sucedida
    public boolean remove(T elemento) {
        return lista.remove(elemento);
    }

    // Método para limpar a lista
    public void limpar() {
        lista.clear();
    }

    // metodo que retorna o tamanho da lista
    public int tamanho() {
        return lista.size();
    }

    // metodo que verifica se a lista ta vazia
    public boolean estaVazia() {
        return lista.isEmpty();
    }

    // metodo que retorna o ultimo indice que determinado elemento aparece na lista
    public int ultimaPosicaoElemento(T elemento) {
        return lista.lastIndexOf(elemento);
    }

    // metodo que adiciona um elemento a lista
    public void adicionar(T elemento) {
        lista.add(elemento);
    }

    // metodo que retorna o indice de um elemento na primeira ocorrencia
    public int indiceDe(T elemento) {
        return lista.indexOf(elemento);
    }

    // metodo que imprime os elementos da lista (pra facilitar o teste
    public void imprimirLista() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }
    }

    // metodo que imprime a lista visualmente
    public void imprimirListaVisual() {
        System.out.println("indice:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%3d", i); // indice formatado pra 3 caracteres
        }
        System.out.println(); // queebra de linha

        System.out.println("ocorrencias:");
        for (T elemento : lista) {
            System.out.printf("%3s", elemento); // elementos formatados para ter 3 caracteres
        }
        System.out.println(); // quebra de linha
    }
}


