package com.devon.faculdade.algoritimos.listaencadeada;

import java.io.InputStream;
import java.util.Comparator;

public class ListaEncadeada<T> implements Iterador<T>{

	private NoLista<T> dado;	
	private NoLista<T> primeiro = null;
	private NoLista<T> ultimo = null;
	
	
	
	@Override
	public void inserir(T novoDado) {
		dado = new NoLista<T>();
		dado.setDado(novoDado);
		if(this.primeiro == null) {
			addFirst(dado.getDado());
		} 
		if(this.ultimo == null) {
			ultimo = primeiro;
		} else {
			this.ultimo.setProximoDado(dado);
			NoLista<T> dadoAnterior = ultimo;
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
			NoLista<T> dado = this.dado;
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
		NoLista<T> dadoAtual = primeiro;
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
	
	public NoLista<T> getPrimeiro() {
		return primeiro;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public void retirar(NoLista<T> dado) {
		NoLista<T> dadoAtual = primeiro;
		NoLista<T> anterior = primeiro;
		if(dado != null && dado.equals(primeiro)) {
			primeiro = primeiro.getProximoDado();
		} else {
			while(dadoAtual != null) {
				if(dadoAtual.equals(dado)) {
					dadoAtual = anterior.getProximoDado();
					break;
				}
				anterior = dadoAtual;
				dadoAtual = dadoAtual.getProximoDado();
			}
		}
	}
	
	public NoLista<T> buscar(NoLista<T> dado) {
		NoLista<T> dadoAtual = primeiro;
		if(dado != null && dado.equals(primeiro)) {
			return primeiro;
		} else {
			while(dadoAtual != null) {
				if(dadoAtual.equals(dado)) {
					return dadoAtual;
				}
				dadoAtual = dadoAtual.getProximoDado();
			}
		}
		return null;
	}
	
	public int obterComprimeito() {
		int tamanho = 0;
		NoLista<T> dadoAtual = primeiro;
		while(dadoAtual != null) {
			tamanho++;
		}
		return tamanho;
	}
	
	public NoLista<T> obterNo(int posicao) {
		int posicaoAtual = 0;
		NoLista<T> dadoAtual = primeiro;
		if(posicao == 0) {
			return dadoAtual;
		}
		while(dadoAtual != null) {
			posicaoAtual++;
			if(posicao == posicaoAtual) {
				
			}
			dadoAtual = dadoAtual.getProximoDado();
			
		}
		return dadoAtual;
		
	}
	
}
