package com.devon.faculdade.algoritimos.exe52;

public class OrdenacaoQuickSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	@Override
	public void ordenar() {
		quickSort(0, getInfo().length);
	}
	
	private void quickSort(int inicio, int fim) {
		int indexPivo;
		if(inicio < fim) {
			indexPivo = particionar(inicio, fim);
			quickSort(inicio, indexPivo - 1);
			quickSort(indexPivo + 1, fim);
		}
		
	}
	
	private int particionar(int inicio, int fim) {
		int a = inicio;
		int b = fim ;
		T pivo = getInfo()[inicio];
		
		while(true) {
			a = a + 1;
			while(a <= fim && getInfo()[a].compareTo(pivo) < 0) {
				b = b - 1;
				while(b >= inicio && getInfo()[b].compareTo(pivo) > 0) {
					if(a >= b) {
						break;
					}
					troca(a, b);
				}
				troca(b, inicio);
			}
			return b;
		}
		
	}
	
	

}
