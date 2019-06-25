package com.devon.faculdade.algoritimos.exe52;

public class OrdenacaoBolha<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	@Override
	public void ordenar() {
		T[] info = getInfo();
		for (int i = info.length; i > 1 ; i--) {
			for (int j = 0; j < i-1; j++) {
				if(info[j].compareTo(info[j+1]) > 0) {
					troca(j, j+1);
				}
			}
		}
	}

	
	
}
