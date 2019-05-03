package com.devon.faculdade.algoritimos.prova1;

import com.devon.faculdade.algoritimos.listaencadeada.ListaEncadeada;

public class Main {
	
	public static void main(String[] args) {
		ListaEstatica lt = new ListaEstatica();
		lt.inserir(10);
		lt.inserir(20);
		lt.inserir(30);
		lt.inserir(40);
		lt.inserir(50);
		lt.inserir(60);
		lt.inserir(70);
		lt.inserir(80);
		lt.inserir(90);
		lt.inserir(100);
		lt.exibir();
		lt.inserir(15);
		lt.exibir();
	}

}
