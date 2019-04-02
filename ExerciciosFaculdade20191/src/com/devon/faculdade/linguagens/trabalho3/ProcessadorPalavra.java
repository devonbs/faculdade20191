package com.devon.faculdade.linguagens.trabalho3;

public class ProcessadorPalavra {
	
	private String palavra;
	private final static String PADRAO = "(((b|c)*a)2)+ - a*(((b|c)a*)2)+";
	private EstruturaPalavra estruturaPalavra;
	
	public ProcessadorPalavra(String valor) {
		palavra = valor;
	}

	public void processaPalavra() {
		System.out.println(palavra);
		estruturaPalavra = new EstruturaPalavra();
		separaSequenciasPermitidas();
		
	}

	private void separaSequenciasPermitidas() {
		String[] sequenciasPermitidas = PADRAO.split("-");
		for (int i = 0; i < sequenciasPermitidas.length; i++) {
			analisaSequencia(sequenciasPermitidas[i]);
		}
	}

	private void analisaSequencia(String sequencia) {
		System.out.println(sequencia);
		
	}
	
	

}
