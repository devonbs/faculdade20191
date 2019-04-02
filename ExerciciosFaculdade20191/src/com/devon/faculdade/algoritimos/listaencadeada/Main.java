package com.devon.faculdade.algoritimos.listaencadeada;

public class Main {
	
	public static void main(String[] args) {
		ListaEncadeada<String> listaDupla = new ListaEncadeada<String>();
		
		listaDupla.inserir("1");
		listaDupla.inserir("2");
		listaDupla.inserir("3");
		listaDupla.inserir("4");
		listaDupla.inserir("5");
		listaDupla.inserir("6");
		listaDupla.inserir("7");
		listaDupla.inserir("8");
		
		listaDupla.exibir();
		listaDupla.exibirOrdemInversa();
	}

}
