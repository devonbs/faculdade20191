package com.devon.faculdade.algoritimos.exe22_3;

public class PilhaVetor<T> implements IPilha<T> {

	private T[] info;
	private int limite;
	private int tamanho;
	
	public PilhaVetor(int limite) {
		this.limite = limite;
		info = (T[]) new Object[limite];
	}
	
	@Override
	public void push(T valor) {
		if(this.limite == this.tamanho) {
			throw new PilhaCheiaException();
		} else {
			tamanho++;
			this.info[limite - tamanho] = valor;
		}
	}

	@Override
	public T pop() {
		if(estaVazia()) {
			throw new PilhaVaziaException();
		}
		T valorRetornar = this.info[limite - tamanho];
		this.info[limite - tamanho] = null;
		tamanho--;
		return valorRetornar;
	}

	@Override
	public T peek() {
		if(estaVazia()) {
			throw new PilhaVaziaException();
		}
		return this.info[limite - tamanho];
	}

	@Override
	public boolean estaVazia() {
		if(tamanho == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void liberar() {
		for (int i = 0; i < info.length; i++) {
			info[i] = null;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < info.length; i++) {
			if(info[i] != null) {
				sb.append(info[i]);
				if((i+1) < info.length) {
					sb.append(", ");
				}
			}
		}
		return sb.toString();
	}
	
	public PilhaVetor<T> concatenar(PilhaVetor<T> umaPilha) {
		Integer tamanhoPilha = umaPilha.getTamanho();
		for (int i = 0; i < tamanhoPilha; i++) {
			push(umaPilha.pop());
		}
		umaPilha.liberar();
		return this;
	}

	public T[] getInfo() {
		return info;
	}

	public void setInfo(T[] info) {
		this.info = info;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
