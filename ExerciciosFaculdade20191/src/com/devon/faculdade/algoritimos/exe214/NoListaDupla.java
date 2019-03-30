package com.devon.faculdade.algoritimos.exe214;

public class NoListaDupla<T> {
	
	private T dado;
	private NoListaDupla<T> proximoDado;
	private NoListaDupla<T> dadoAnterior;
	
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	public NoListaDupla<T> getProximoDado() {
		return proximoDado;
	}
	public void setProximoDado(NoListaDupla<T> proximoDado) {
		this.proximoDado = proximoDado;
	}
	public NoListaDupla<T> getDadoAnterior() {
		return dadoAnterior;
	}
	public void setDadoAnterior(NoListaDupla<T> dadoAnterior) {
		this.dadoAnterior = dadoAnterior;
	}
	@Override
	public String toString() {
		return  dado.toString();
	}

}
