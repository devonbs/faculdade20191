package com.devon.faculdade.algoritimos.exe53;

public class Main {
	
	public static void main(String[] args) {
		Integer[] novaLista = {70,2,88,15,90,30};
		
		OrdenacaoMergeSort<Integer> ordenacao = new OrdenacaoMergeSort<Integer>();
		
		ordenacao.setInfo(novaLista);
		ordenacao.ordenar();
	}

}
