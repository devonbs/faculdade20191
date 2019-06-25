package com.devon.faculdade.algoritimos.exe53;

public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T> {

	@Override
	public void ordenar() {
		int n = getInfo().length;
		mergeSort(0, n);
		for (int i = 0; i < n; i++) {
			System.out.print(getInfo()[i] + ", ");
		}
	}
	
	private void mergeSort(int inicio, int fim) {
		int meio = 0;
		if(inicio <  fim) {
			meio = (inicio + fim) / 2;
			mergeSort(inicio, meio);
			mergeSort(meio+1, fim);
			merge(inicio, fim, meio);
		}
	}
	
	private void merge(int inicio, int fim, int meio) {
		T[] info = getInfo();
		
		int tamEsquerda = meio - inicio + 1;
		T[] infoEsq = (T[]) new Comparable[tamEsquerda];
		for (int i = 0; i <= tamEsquerda -1; i++) {
			infoEsq[i] = info[inicio+i];
		}
		
		int tamDireita = fim - meio;
		T[] infoDir = (T[]) new Comparable[tamDireita];
		for (int i = 0; i <= tamDireita -1; i++) {
			infoDir[i] = info[meio+1+i];
		}
		
		int cEsq = 0;
		int cDir = 0;
		
		int i = inicio;
		
		for (; i <= fim; i++) {
			if((cEsq < tamEsquerda) && (cDir < tamDireita)) {
				if(infoEsq[cEsq].compareTo(infoDir[cDir]) < 0) {
					info[i] = infoEsq[cEsq];
					cEsq++;
				} else {
					info[i] = infoDir[cDir];
					cDir++;
				}
			} else {
				break;
			}
		}
		
		while (cEsq < tamEsquerda) {
			info[i] = infoEsq[cEsq];
			cEsq++;
			i++;
		}
		
		while (cDir < tamDireita) {
			info[i] = infoDir[cDir];
			cDir++;
			i++;
		}
		
	}
	
	@Override
	public String toString() {
		String resulta = "{" + getInfo()[0];
		for (int i = 1; i < getInfo().length; i++) {
			resulta += "," + getInfo()[i];
		}
		resulta += "}";
		return resulta;
	}

}
