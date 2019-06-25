package com.devon.faculdade.algoritimos.exe43;

public abstract class ArvoreBinariaAbstract<T> {

    private NoArvoreBinaria<T> raiz;
    
    public ArvoreBinariaAbstract() {
        this.raiz = null;
    }

    protected void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
    
    public NoArvoreBinaria<T> getRaiz() {
        return this.raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(T info) {
        return buscar(info) != null;
    }
    
    public abstract NoArvoreBinaria<T> buscar(T info);
    
    private String arvorePre(NoArvoreBinaria<T> no) {
        String resultado = "<";
        if (no != null) {
            resultado += no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita());
        }
        return resultado + ">";
    }
    
    @Override
    public String toString() {
        return arvorePre(raiz);
    }
    
    public int contarNos() {
        return contarNos(raiz);
    }

    public int contarNos(NoArvoreBinaria<T> no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
    }
    
//////    public int contarFolhas() {
//////        return contarFolhas(raiz);
//////    }
//////    
//////    // Prova 2
//////    private int contarFolhas(NoArvoreBinaria<T> no) {
//////        // Se o nó for nulo retorna 0
//////        if (no == null)
//////            return 0;
//////        // Confere se é folha (sem filhos na direita e na esquerda)
//////        if (no.getDireita() == null && no.getEsquerda() == null)
//////            return 1;
//////        // Se não se enquadra em nenhuma das condições anteriores
//////        // confere os filhos
//////        return contarFolhas(no.getDireita()) + contarFolhas(no.getEsquerda());
//////    }
}
