package com.devon.faculdade.algoritimos.prova2;

public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {

        return (raiz == null);

    }

    public boolean pertence(T info) {
        return pertence(raiz, info);

    }

    private boolean pertence(NoArvoreBinaria no, T info) {
        if (no == null) {
            return false;
        } else {
            return (no.getInfo().equals(info)
                    || pertence(no.getEsquerda(), info)
                    || pertence(no.getDireita(), info));
        }
    }

    @Override
    public String toString() {
        return arvorePre(raiz);

    }

    private String arvorePre(NoArvoreBinaria no) {
        if (no == null) {
            return "<>";

        } else {
            return "<"
                    + no.getInfo()
                    + arvorePre(no.getEsquerda())
                    + arvorePre(no.getDireita())
                    + ">";
        }
    }

    public int contarNos() {
        return contarNos(raiz);

    }

    private int contarNos(NoArvoreBinaria no) {
        if (no == null) {
            return 0;
        }
        return 1
                + contarNos(
                        no.getEsquerda())
                + contarNos(
                        no.getDireita());

    }
    
    public int contarFolhas() {
    	if (raiz == null) {
            return 0;
        }
    	NoArvoreBinaria<T> no = raiz;
        return 0
                + contarNos(
                        no.getEsquerda())
                + contarNos(
                        no.getDireita());
    	
    }
}
