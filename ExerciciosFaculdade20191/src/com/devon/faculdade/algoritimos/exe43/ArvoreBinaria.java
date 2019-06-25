package com.devon.faculdade.algoritimos.exe43;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

    @Override
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        return buscar(this.getRaiz(), info);
    }

    private NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
        if (no == null)
            return null;
        
        if (no.getInfo().equals(info)) {
            return no;
        } else {
            NoArvoreBinaria<T> aux;
            
            aux = buscar(no.getEsquerda(), info);
            if (aux == null)
                aux = buscar(no.getDireita(), info);
            
            return aux;
        }
    }
}
