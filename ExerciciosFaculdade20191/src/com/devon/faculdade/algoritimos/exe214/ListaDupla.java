package com.devon.faculdade.algoritimos.exe214;

public class ListaDupla<T> {

	private NoListaDupla<T> primeiro = null;
	private NoListaDupla<T> ultimo = null;
	
	public ListaDupla() {
		primeiro = null;
	}
	
	
	public void inserir(T dado) {
		NoListaDupla<T> novoDado = new NoListaDupla<T>();
		novoDado.setDado(dado);
		novoDado.setProximoDado(primeiro);
		//novoDado.setDadoAnterior(null);
		if(primeiro != null) {
			primeiro.setDadoAnterior(novoDado);
			ultimo = novoDado.getProximoDado();
			//primeiro.setProximoDado(novoDado.getDadoAnterior());
		} 
		primeiro = novoDado;
	}
	
	public void exibir() {
		NoListaDupla<T> dadoAtual = primeiro;
		while(dadoAtual != null) {
			System.out.println(dadoAtual.toString());
			dadoAtual = dadoAtual.getProximoDado();
		}
	}
	
	public void exibirOrdemInversa() {
		NoListaDupla<T> dadoAtual = ultimo;
		while(dadoAtual != null) {
			System.out.println(dadoAtual.toString());
			dadoAtual = dadoAtual.getDadoAnterior();
		}
	}
	
	public NoListaDupla<T> getPrimeiro() {
		return primeiro;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public void retirar(T dado) {
		NoListaDupla<T> dadoAtual = primeiro;
		NoListaDupla<T> anterior = null;
		while(dadoAtual != null && !dadoAtual.getDado().equals(dado)) {
			anterior = dadoAtual;
			dadoAtual = dadoAtual.getProximoDado();
		}
		
		if(dadoAtual != null) {
			if(anterior == null) {
				this.primeiro = dadoAtual.getProximoDado();
			} else {
				anterior.setProximoDado(dadoAtual.getProximoDado());
				dadoAtual.getProximoDado().setDadoAnterior(dadoAtual.getDadoAnterior());
			}
		}
	}
	
	public NoListaDupla<T> buscar(T dado) {
		NoListaDupla<T> dadoAtual = primeiro;
		while(dadoAtual != null) {
			if(dadoAtual.equals(dado)) {
				return dadoAtual;
			}
			dadoAtual = dadoAtual.getProximoDado();
		}
		return null;
	}
	
	public int obterComprimeito() {
		int tamanho = 0;
		NoListaDupla<T> dadoAtual = primeiro;
		while(dadoAtual != null) {
			tamanho++;
			dadoAtual = dadoAtual.getProximoDado();
		}
		return tamanho;
	}
	
	public NoListaDupla<T> obterNo(int posicao) {
		int posicaoAtual = 0;
		NoListaDupla<T> dadoAtual = primeiro;
		if(posicao < 0) {
			throw new IndexOutOfBoundsException();
		}
	
		while(dadoAtual != null) {
			if(posicao == posicaoAtual) {
				return dadoAtual;
			}
			dadoAtual = dadoAtual.getProximoDado();
			posicaoAtual++;
		}
		return null;
		
	}
	
	public void liberar() {
		NoListaDupla<T> dadoAtual = primeiro;
		NoListaDupla<T> dadoAnterior = null;
		while(dadoAtual != null) {
			dadoAnterior = dadoAtual.getDadoAnterior();
			if(dadoAnterior != null) {
				dadoAnterior.setProximoDado(null);
				dadoAnterior.setDadoAnterior(null);
			}
			dadoAtual = dadoAtual.getProximoDado();
		}
	}
	
}
