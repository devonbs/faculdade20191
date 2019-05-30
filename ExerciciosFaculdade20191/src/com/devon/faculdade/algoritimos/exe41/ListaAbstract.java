package com.devon.faculdade.algoritimos.exe41;

public abstract class ListaAbstract<T> {
	
	
	private T[] info;
	private int tamanho;
	private final int TAMANHO_INICIAL = 10;
	
	public ListaAbstract() {
		info = (T[]) new Object[TAMANHO_INICIAL];
		tamanho = 0;
	}
	
//	private void redimensionar() {
//		T[] novoVetor = (T[]) new Object[info.length + 10];
//		for (int i = 0; i < info.length; i++) {
//			novoVetor[i] = info[i];
//		}
//		info = novoVetor;
//	}
	
	public abstract void inserir(T dado);
	
	public void exibir() {
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
	}
	
	public abstract int buscar(T valor);
	
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
	
	public T obterElemento(int posicao) {
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
	
	protected T[] getInfo() {
		return this.info;
	}
	
	protected void redimensionar() {
		T[] novoVetor = (T[]) new Object[info.length + 10];
		for (int i = 0; i < info.length; i++) {
			novoVetor[i] = info[i];
		}
		info = novoVetor;
	}
	
	protected void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
