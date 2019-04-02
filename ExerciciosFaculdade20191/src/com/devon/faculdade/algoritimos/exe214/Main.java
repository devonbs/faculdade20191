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
		
		listaDupla.exibirOrdemInversa();
		listaDupla.exibir();
		System.out.println("retirar 1");
		listaDupla.retirar("1");
		listaDupla.exibir();
		System.out.println("retirar 8");
		listaDupla.retirar("8");
		listaDupla.exibir();
		System.out.println("retirar 4");
		listaDupla.retirar("4");
		listaDupla.exibir();
		System.out.println("retirar 2");
		listaDupla.retirar("2");
		listaDupla.exibir();
	}

}
