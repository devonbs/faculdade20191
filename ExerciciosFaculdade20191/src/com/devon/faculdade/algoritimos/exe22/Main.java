package com.devon.faculdade.algoritimos.exe22;

public class Main {
	
	public static void main(String[] args) {
		PilhaVetor<Integer> pilha = new PilhaVetor<Integer>(4);
		System.out.println(pilha.estaVazia() ? "Sim" : "Não");
		pilha.push(8);
		pilha.push(6);
		pilha.push(4);
		pilha.push(2);
		System.out.println(pilha.estaVazia() ? "Sim" : "Não");
		PilhaVetor<Integer> pilha2 = new PilhaVetor<Integer>(10);
		pilha2.push(18);
		pilha2.push(16);
		pilha2.push(14);
		pilha2.push(12);
		
		System.out.println(pilha.toString());
		//pilha.concatenar(pilha2);
		System.out.println(pilha.toString());
		System.out.println("pilha 2: "+ pilha2.toString());
		
	}

}
