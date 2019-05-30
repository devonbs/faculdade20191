package com.devon.faculdade.algoritimos.exe41;

public class NoArvoreBinaria<T> {
	
	private T info;
	private NoArvoreBinaria<T> primeiro;
	private NoArvoreBinaria<T> proximo;
	
	public NoArvoreBinaria(T info) {
		this.info = info;
		primeiro = null;
		proximo = null;
	}
	
	public void inserirFilho(NoArvoreBinaria<T> sa) {
		sa.setProximo(primeiro);
		setPrimeiro(sa);
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public NoArvoreBinaria<T> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(NoArvoreBinaria<T> primeiro) {
		this.primeiro = primeiro;
	}

	public NoArvoreBinaria<T> getProximo() {
		return proximo;
	}

	public void setProximo(NoArvoreBinaria<T> proximo) {
		this.proximo = proximo;
	}

}
