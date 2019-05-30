package com.devon.faculdade.algoritimos.prova2T;
public class FilaVetor<T> implements Fila<T> {

    private T[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = (T[]) new Object[limite];
        this.limite = limite;
        inicio = 0;
        tamanho = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException("A fila está cheia.");
        }

        int posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException("A fila está vazia.");
        }

        return info[inicio];
    }

    @Override
    public T retirar() {
        T valor = peek();

        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;

        return valor;
    }

    @Override
    public void liberar() {
        while (!estaVazia()) {
            retirar();
        }
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);

        copiarValoresFila(this, f3);
        copiarValoresFila(f2, f3);

        return f3;
    }

    @Override
    public String toString() {
        String resultado = "";

        int indice = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) {
                resultado += ",";
            }
            resultado += info[i];
            indice = (indice + 1) % limite;
        }

        return resultado;
    }

    private void copiarValoresFila(FilaVetor<T> origem, FilaVetor<T> destino) {
        int indice = origem.inicio;
        for (int i = 0; i < origem.tamanho; i++) {
            destino.inserir(origem.info[indice]);
            indice = (inicio + 1) % origem.limite;
        }
    }

    

}
