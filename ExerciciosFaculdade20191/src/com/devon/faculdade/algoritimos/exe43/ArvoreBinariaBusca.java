package com.devon.faculdade.algoritimos.exe43;

public class ArvoreBinariaBusca<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

    public void inserir(T info) {
        NoArvoreBinaria<T> novo = new NoArvoreBinaria<T>(info);

        if (estaVazia()) {
            setRaiz(novo);
        } else {
            NoArvoreBinaria<T> p = getRaiz();
            NoArvoreBinaria<T> pai;

            while (true) {
                pai = p;
                if (info.compareTo(p.getInfo()) < 0) {
                    p = p.getEsquerda();
                    if (p == null) {
                        pai.setEsquerda(novo);
                        return;
                    }
                } else {
                    p = p.getDireita();
                    if (p == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public NoArvoreBinaria<T> buscar(T info) {
        NoArvoreBinaria<T> p = getRaiz();

        while (p != null && !p.getInfo().equals(info)) {
            if (info.compareTo(p.getInfo()) < 0) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }

        return p;
    }

    public void retirar(T info) {
        NoArvoreBinaria<T> p = getRaiz();
        NoArvoreBinaria<T> pai = null;
        boolean filhoEsquerda = false;

        // Localiza o nó a ser removido
        while ((p != null) && (!p.getInfo().equals(info))) {
            pai = p;
            if (info.compareTo(p.getInfo()) < 0) {
                filhoEsquerda = true;
                p = p.getEsquerda();
            } else {
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }

        if (p != null) { // Achou o dado a ser removido?
            // Avalia se é nó folha
            if ((p.getEsquerda() == null) && (p.getDireita() == null)) {
                // 1o. Caso
                if (p == getRaiz()) {
                    setRaiz(null);
                } else {
                    if (filhoEsquerda) {
                        pai.setEsquerda(null);
                    } else {
                        pai.setDireita(null);
                    }
                }
            } else {
                if (p.getEsquerda() == null) {
                    // Nó com apenas um filho à direita
                    // 2o. Caso
                    if (p == getRaiz()) {
                        setRaiz(p.getDireita());
                    } else {
                        if (filhoEsquerda) {
                            pai.setEsquerda(p.getDireita());
                        } else {
                            pai.setDireita(p.getDireita());
                        }
                    }
                } else {
                    // Nó com um filho à esquerda e à direita
                    // 3o. Caso
                    NoArvoreBinaria<T> sucessor = extrairSucessor(p);
                    if (p == getRaiz()) {
                        setRaiz(sucessor);
                    } else {
                        if (filhoEsquerda) {
                            pai.setEsquerda(sucessor);
                        } else {
                            pai.setDireita(sucessor);
                        }
                    }
                    sucessor.setEsquerda(p.getEsquerda());
                }
            }
        }
    }

    private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> excluir) {
        NoArvoreBinaria<T> p = excluir.getDireita();
        NoArvoreBinaria<T> paiSucessor = excluir;
        NoArvoreBinaria<T> sucessor = p;

        while (p != null) {
            paiSucessor = sucessor;
            sucessor = p;
            p = p.getEsquerda();
        }

        if (sucessor != excluir.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(excluir.getDireita());
        }

        return sucessor;
    }
}