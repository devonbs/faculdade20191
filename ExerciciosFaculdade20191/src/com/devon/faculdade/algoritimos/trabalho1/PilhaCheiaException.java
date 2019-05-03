package com.devon.faculdade.algoritimos.trabalho1;

public class PilhaCheiaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2127981452795505317L;
	
	public PilhaCheiaException() {
		System.err.println("Pilha Cheia!");
	}

}
