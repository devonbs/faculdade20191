package com.devon.faculdade.algoritimos.prova2;

public class Main {
	
	public static void main(String[] args) {
		fila();
		//arvore();
		
	}

	public static void arvore() {
		ArvoreBinaria<String> arvore = new ArvoreBinaria<String>();
		NoArvoreBinaria<String> raiz = new NoArvoreBinaria<String>("10");
		NoArvoreBinaria<String> noArvore2 = new NoArvoreBinaria<String>("20");
		NoArvoreBinaria<String> noArvore3 = new NoArvoreBinaria<String>("30");
		NoArvoreBinaria<String> noArvore4 = new NoArvoreBinaria<String>("40");
		NoArvoreBinaria<String> noArvore5 = new NoArvoreBinaria<String>("50");
		NoArvoreBinaria<String> noArvore6 = new NoArvoreBinaria<String>("60");
		arvore.setRaiz(raiz);
		
		raiz.setDireita(noArvore2);
		raiz.setEsquerda(noArvore3);
		noArvore3.setDireita(noArvore4);
		noArvore2.setEsquerda(noArvore5);
		noArvore5.setEsquerda(noArvore6);
		
		System.out.println(arvore.contarFolhas());
		
	}
	
	
	private static void fila() {
		FilaVetor<String> fila = new FilaVetor<String>(10);

		fila.inserir("10");
		fila.inserir("20");
		fila.inserir("30");
		fila.inserir("40");
		fila.inserir("50");
		//System.out.println(fila.toString());
		fila.retirar();
		fila.retirar();
		//System.out.println(fila.toString());
		fila.encolher();
		System.out.println(fila.toString());
	}

}
