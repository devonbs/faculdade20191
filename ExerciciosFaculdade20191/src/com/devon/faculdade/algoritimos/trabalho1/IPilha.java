package com.devon.faculdade.algoritimos.trabalho1;

public interface IPilha<T> {
	
	/**
	 * Empilhar valor
	 * @param info
	 */
	public void push(T info);
	/**
	 * Remover valor do topo da pilha
	 * @return
	 */
	public T pop();
	/**
	 * Retorna o valor do topo da pilha
	 * @return
	 */
	public T peek();
	/**
	 * Retorna se a pilha esta vazia
	 * @return
	 */
	public boolean estaVazia();
	/**
	 * Desempilhar valores da pilha
	 */
	public void liberar();

}
