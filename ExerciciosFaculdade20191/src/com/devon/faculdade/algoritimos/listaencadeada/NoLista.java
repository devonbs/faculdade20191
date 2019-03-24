package com.devon.faculdade.algoritimos.listaencadeada;

public class NoLista<T> {
	
	private T dado;
	private NoLista<T> proximoDado;
	private NoLista<T> dadoAnterior;
	
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public NoLista<T> getProximoDado() {
		return proximoDado;
	}
	public void setProximoDado(NoLista<T> proximoDado) {
		this.proximoDado = proximoDado;
	}
	public NoLista<T> getDadoAnterior() {
		return dadoAnterior;
	}
	public void setDadoAnterior(NoLista<T> dadoAnterior) {
		this.dadoAnterior = dadoAnterior;
	}
	@Override
	public String toString() {
		return  dado.toString();
	}

}
