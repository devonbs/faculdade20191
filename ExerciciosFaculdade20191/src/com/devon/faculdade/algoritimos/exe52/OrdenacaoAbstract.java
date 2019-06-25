package com.devon.faculdade.algoritimos.exe52;

public abstract class OrdenacaoAbstract<T extends Comparable<T>> {

	private T[] info;

	public T[] getInfo() {
		return info;
	}

	public void setInfo(T[] info) {
		this.info = info;
	}

	public void troca(int a, int b) {
		T aux = null;
		aux = info[a];
		info[a] = info[b];
		info[b] = aux;
	}
	
	public abstract void ordenar();
	
}
