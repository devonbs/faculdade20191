package com.devon.faculdade.algoritimos.exe41;

public class ListaEstatica<T> extends ListaAbstract {

	@Override
	public void inserir(Object dado) {
		Object[] info = super.getInfo();
		int tamanho = super.getTamanho();
		if(info.length == tamanho) {
			redimensionar();
		} 
		info[tamanho] = dado;
		setTamanho(tamanho + 1);

	}

	@Override
	public int buscar(Object valor) {
		Object[] info = super.getInfo();
		for (int i = 0; i < info.length; i++) {
			if(valor.equals(info[i])) {
				return i;
			}
		}
		return -1;
	}

}
