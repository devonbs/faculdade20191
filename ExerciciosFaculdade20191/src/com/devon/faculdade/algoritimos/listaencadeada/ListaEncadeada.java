package com.devon.faculdade.algoritimos.listaencadeada;

import java.io.InputStream;
import java.util.Comparator;

public class ListaEncadeada<T> implements Iterador<T>{

	private Dado<T> dado;	
	private Dado<T> primeiro = null;
	private Dado<T> ultimo = null;
	
	
	@Override
	public void append(T novoDado) {
		dado = new Dado<T>();
		dado.setDado(novoDado);
		if(this.primeiro == null) {
			addFirst(dado.getDado());
		} 
		if(this.ultimo == null) {
			ultimo = primeiro;
		} else {
			this.ultimo.setProximoDado(dado);
			Dado<T> dadoAnterior = ultimo;
			ultimo = dado;
			this.ultimo.setDadoAnterior(dadoAnterior);
			this.ultimo.setProximoDado(null);
		}		
		
	}
	@Override
	public void addFirst(T novoDado) {
		if(this.primeiro == null) {
			//primeiro = new Dado<T>();
			primeiro = dado;
			primeiro.setDado(novoDado);
		} else {
			Dado<T> dado = this.dado;
			primeiro.setDado(novoDado);
			primeiro.setProximoDado(dado);
			primeiro.setDadoAnterior(null);
		}
		
	}
	@Override
	public T search(Comparator<T> cmp) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void printObjects() {
		Dado<T> dadoAtual = primeiro;
		while(dadoAtual != null) {
			System.out.println(dadoAtual.toString());
			dadoAtual = dadoAtual.getProximoDado();
		}

		
	}
	@Override
	public ListaEncadeada<T> loadFromFile(InputStream input) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
