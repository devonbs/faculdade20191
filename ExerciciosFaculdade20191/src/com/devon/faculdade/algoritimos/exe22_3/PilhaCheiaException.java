package com.devon.faculdade.algoritimos.exe22_3;

public class PilhaCheiaException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2127981452795505317L;
	
	public PilhaCheiaException() {
		System.err.println("Pilha Cheia!");
	}

}
