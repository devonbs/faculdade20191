package com.devon.faculdade.algoritimos.exe214;

public class Main {
	
	public static void main(String[] args) {
		ListaDupla<String> listaDupla = new ListaDupla<String>();
		
		listaDupla.inserir("1");
		listaDupla.inserir("2");
		listaDupla.inserir("3");
		listaDupla.inserir("4");
		listaDupla.inserir("5");
		listaDupla.inserir("6");
		listaDupla.inserir("7");
		listaDupla.inserir("8");
		listaDupla.exibir();
		
		System.out.println("NOVA LISTA");
		ListaDupla<String> novaLista = listaDupla.clonar();
		novaLista.exibir();
	}

}
