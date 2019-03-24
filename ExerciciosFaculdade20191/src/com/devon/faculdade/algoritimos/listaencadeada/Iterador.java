package com.devon.faculdade.algoritimos.listaencadeada;

import java.io.InputStream;
import java.util.Comparator;

public interface Iterador<T> {

	public void inserir(T dado) ;
	
	public void addFirst(T dado) ;
	
	public T search(Comparator<T> cmp) ;
	
	public void printObjects() ;
	
	public ListaEncadeada<T> loadFromFile(InputStream input) ;
	
}
