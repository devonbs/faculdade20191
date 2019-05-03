package com.devon.faculdade.algoritimos.prova1;

public class ListaDupla<T> {

	private NoListaDupla<T> primeiro = null;
	private NoListaDupla<T> ultimo = null;
	
	public ListaDupla() {
		primeiro = null;
	}
	
	public ListaDupla<T> clonar() {
		NoListaDupla<T> noLista = primeiro;
		NoListaDupla<T> anterior = null;
		ListaDupla<T> novaLista = new ListaDupla<T>();
		while(noLista != null) {
			anterior = noLista;
			noLista = noLista.getProximoDado();
		}
		noLista = anterior;
		while(noLista != null) {
			novaLista.inserir(noLista.getDado());
			noLista = noLista.getDadoAnterior();
		}
		return novaLista;
	}
	
	public void inserir(T dado) {
		NoListaDupla<T> novoDado = new NoListaDupla<T>();
		novoDado.setDado(dado);
		novoDado.setProximoDado(primeiro);
		novoDado.setDadoAnterior(null);
		if(primeiro != null) {
			primeiro.setDadoAnterior(novoDado);
			//primeiro.setProximoDado(novoDado.getDadoAnterior());
		}
		if (ultimo == null) {
			ultimo = novoDado;
			ultimo.setDadoAnterior(novoDado);
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
				if(dadoAtual.getProximoDado() != null) {
					dadoAtual.getProximoDado().setDadoAnterior(dadoAtual.getDadoAnterior());
				}
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
		primeiro = null;
	}
	
	@Override
	public String toString() {
		NoListaDupla<T> dadoAtual = primeiro;
		StringBuilder sb = new StringBuilder();
		while(dadoAtual != null) {
			sb.append(dadoAtual.toString());
			dadoAtual = dadoAtual.getProximoDado();
			if(dadoAtual != null) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}
	
}
