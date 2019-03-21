package com.devon.faculdade.algoritimos.listaencadeada;

public class Dado<T> {
	
	private T dado;
	private Dado<T> proximoDado;
	private Dado<T> dadoAnterior;
	
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public Dado<T> getProximoDado() {
		return proximoDado;
	}
	public void setProximoDado(Dado<T> proximoDado) {
		this.proximoDado = proximoDado;
	}
	public Dado<T> getDadoAnterior() {
		return dadoAnterior;
	}
	public void setDadoAnterior(Dado<T> dadoAnterior) {
		this.dadoAnterior = dadoAnterior;
	}
	@Override
	public String toString() {
		return  dado.toString();
	}

}
