package com.devon.faculdade.algoritimos.exe22;

public class PilhaVaziaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3388982571013609396L;
	
	public PilhaVaziaException() {
		System.err.println("Pilha vazia!");
	}
}
