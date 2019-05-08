package com.devon.faculdade.algoritimos.trabalho1;

public class ListaEstatica<T> {
	
	
	//mudar pra genericos
	
	private T[] info;
	private int tamanho;
	private final int TAMANHO_INICIAL = 10;
	
	public ListaEstatica() {
		tamanho = 0;
		info = (T[]) new Object[10];
	}
	
	private void redimensionar() {
		T[] novoVetor = (T[]) new Object[info.length + 10];
		for (int i = 0; i < info.length; i++) {
			novoVetor[i] = info[i];
		}
		info = novoVetor;
	}
	
	public void inserir(T dado) {
		if(info.length == tamanho) {
			redimensionar();
		} else {
			info[tamanho] = dado;
			tamanho++;
		}
	}
	
	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			if(info[i] != null) {
				System.out.println(info[i]);
			}
		}
	}
	
	public int buscar(T valor) {
		for (int i = 0; i < info.length; i++) {
			if(valor.equals(info[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void retirar(T valor) {
		int posicao = buscar(valor);
		if(posicao > -1) {
			for (int i = posicao; i < info.length; i++) {
				info[i] = info[i+1];
			}
			tamanho--;
		}
	}
	
	public void liberar() {
		info = (T[]) new Object[info.length];
		tamanho = 0;
	}
	
	public T obterElemento(T valor) {
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
