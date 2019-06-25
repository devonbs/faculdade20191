package com.devon.faculdade.algoritimos.exe52;

public class Main {
	
	public static void main(String[] args) {
		Integer[] listaNumeros = {70,2,88,15,90,30};
		
		OrdenacaoAbstract<Integer> ordenacao = new OrdenacaoQuickSort<Integer>();
		ordenacao.setInfo(listaNumeros);
		ordenacao.ordenar();
	}

}
