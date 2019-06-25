package com.devon.faculdade.algoritimos.exe43;

public class NoArvoreBinaria<T> {

    private T info;
    private NoArvoreBinaria<T> esquerda;
    private NoArvoreBinaria<T> direita;

    public NoArvoreBinaria(T info) {
        this.setInfo(info);
        esquerda = null;
        direita = null;
    }
    
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        this.setInfo(info);
        this.setEsquerda(esq);
        this.setDireita(dir);
    }
    
    public void setInfo(T info) {
        this.info = info;
    }
    
    public T getInfo() {
        return this.info;
    }
    
    public void setEsquerda(NoArvoreBinaria<T> esquerda) {
        this.esquerda = esquerda;
    }
    
    public NoArvoreBinaria<T> getEsquerda() {
        return this.esquerda;
    }
    
    public void setDireita(NoArvoreBinaria<T> direita) {
        this.direita = direita;
    }
    
    public NoArvoreBinaria<T> getDireita() {
        return this.direita;
    }
}
