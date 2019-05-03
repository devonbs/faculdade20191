package com.devon.faculdade.algoritimos.trabalho1;

public class PilhaVaziaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3388982571013609396L;
	
	public PilhaVaziaException() {
		System.err.println("Pilha vazia!");
	}
}
