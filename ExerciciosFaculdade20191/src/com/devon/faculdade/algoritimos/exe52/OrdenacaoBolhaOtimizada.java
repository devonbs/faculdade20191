package com.devon.faculdade.algoritimos.exe52;

public class OrdenacaoBolhaOtimizada<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	@Override
	public void ordenar() {
		boolean trocou = false;
		
		T[] info = getInfo();
		for (int i = info.length; i > 1 ; i--) {
			trocou = false;
			for (int j = 0; j < i-1; j++) {
				if(info[j].compareTo(info[j+1]) > 0) {
					troca(j, j+1);
					trocou = true;
				}
			}
			if(!trocou) {
				return;
			}
		}
		
	}

	
	
}
