package com.devon.faculdade.algoritimos.prova1;

public class ListaEstatica {
	
	
	//mudar pra genericos
	
	private int[] info;
	private int tamanho;
	private final int TAMANHO_INICIAL = 10;
	
	public ListaEstatica() {
		tamanho = 0;
		info = new int[TAMANHO_INICIAL];
	}
	
	private void redimensionar() {
		int[] novoVetor = new int[info.length + 10];
		for (int i = 0; i < info.length; i++) {
			novoVetor[i] = info[i];
		}
		info = novoVetor;
		tamanho = info.length;
	}
	
	public void inserir(int dado) {
		int aux = 0;
		int aux2 = 0;
		if(info.length == tamanho) {
			redimensionar();
		} 
		for (int i = 0; i < info.length; i++) {
			if(dado < info[i] && info[i] != 0) {
				aux = info[i];
				info[i] = dado;
				if((i+1) == tamanho && info[i] != 0) {
					redimensionar();
				}
				aux2 = info[i+1];
				info[i+1] = aux;
				dado = aux2;
				if(i > 0 && info[i] == 0) {
					break;
				}
			}
		}
		
		info[tamanho] = dado;
		tamanho++;
	}
	
	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	public int buscar(int valor) {
		for (int i = 0; i < info.length; i++) {
			if(valor == info[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public void retirar(int valor) {
		int posicao = buscar(valor);
		if(posicao > -1) {
			for (int i = posicao; i < info.length; i++) {
				info[i] = info[i+1];
			}
			tamanho--;
		}
	}
	
	public void liberar() {
		info = new int[TAMANHO_INICIAL];
		tamanho = 0;
	}
	
	public int obterElemento(int valor) {
		int posicao = buscar(valor);
		if(posicao >= 0 && (posicao < tamanho)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public boolean estaVazia() {
		return tamanho == 0;
	}
	
	public int getTamanho() {
		return info.length;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < info.length; i++) {
			if(i>0) {
				sb.append(", ");
			}
			sb.append(info[i]);
		}
		return sb.toString();
	}
	
	

}
