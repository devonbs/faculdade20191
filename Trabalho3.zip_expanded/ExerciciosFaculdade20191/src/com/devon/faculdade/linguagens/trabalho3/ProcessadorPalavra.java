package com.devon.faculdade.linguagens.trabalho3;

public class ProcessadorPalavra {
	
	private String palavra;
	private EstruturaPalavra padrao1 = new EstruturaPalavra();
	private EstruturaPalavra padrao2 = new EstruturaPalavra();
	
	public ProcessadorPalavra(String valor) {
		padrao1.setInicio("b|c");
		padrao1.setQtdMinInicio(null);
		padrao1.setMeio("a");
		padrao1.setQtdMinMeio(2);
		padrao1.setFim("b|c");
		padrao1.setQtdMinFim(null);
		
		padrao2.setInicio("a");
		padrao2.setQtdMinInicio(null);
		padrao2.setMeio("b|c");
		padrao2.setQtdMinMeio(2);
		padrao2.setFim("b|c");
		padrao2.setQtdMinFim(null);
		
		palavra = valor;
	}
	
	public String[] validacao() {
		String[] mensagemValicacao = new String[3];
		String palavra1 = processaPalavraPadrao1();
		String palavra2 = processaPalavraPadrao2();
		if(!isPossuiCaracterInvalido(palavra)) {
			if(palavra1 != null || palavra2 != null) {
				mensagemValicacao[0] = "Palavra válida ";
				mensagemValicacao[1] = palavra ;
			} else  {
				mensagemValicacao[0] = "Palavra inválida ";
				mensagemValicacao[1] = palavra ;
			}
		} else if(isPossuiCaracterEspeciao(palavra)) {
			mensagemValicacao[0] = "Palavra inválida ";
			mensagemValicacao[1] = palavra ;
		}
		return mensagemValicacao;
	}

	private boolean isPossuiCaracterEspeciao(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == ',' || palavra.charAt(i) == '.' || palavra.charAt(i) == '?') {
				return true;
			}
		}
		return false;
	}

	private boolean isPossuiCaracterInvalido(String palavra) {
		for (int i = 0; i < palavra.length(); i++) {
			char caracter = palavra.charAt(i);
			if(caracter != 'a' && caracter != 'b' && caracter != 'c') {
				return true;
			} 
		}
		return false;
	}

	public String processaPalavraPadrao1() {
		char[] inicio = padrao1.getInicio().toCharArray();
		char[] meio = padrao1.getMeio().toCharArray();
		char[] fim = padrao1.getFim().toCharArray();
		padrao1.setAceita(false);
		int qtdMeio = 0;
		String sequencia = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'b' || palavra.charAt(i) == 'c') {
				if((palavra.charAt(i) == inicio[0]) || (palavra.charAt(i) == inicio[2])) {
					sequencia += palavra.charAt(i);
				} else if(palavra.charAt(i) == meio[0]) {
					sequencia += palavra.charAt(i);
					qtdMeio++;
				} else if((palavra.charAt(i) == fim[0]) || (palavra.charAt(i) == fim[2])) {
					sequencia += palavra.charAt(i);
				}
			} else {
				return null;
			}
			
		}
		if(qtdMeio == 0 || qtdMeio % padrao2.getQtdMinMeio() != 0) {
			sequencia = null;
		}
		return sequencia;
	}
	
	public String processaPalavraPadrao2() {
		char[] inicio = padrao2.getInicio().toCharArray();
		char[] meio = padrao2.getMeio().toCharArray();
		char[] fim = padrao2.getFim().toCharArray();
		padrao2.setAceita(false);
		int qtdMeio = 0;
		String sequencia = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'b' || palavra.charAt(i) == 'c') {
				if(palavra.charAt(i) == inicio[0]) {
					sequencia += palavra.charAt(i);
				} else if((palavra.charAt(i) == meio[0]) || (palavra.charAt(i) == meio[2])) {
					sequencia += palavra.charAt(i);
					qtdMeio++;
				} else if((palavra.charAt(i) == fim[0]) || (palavra.charAt(i) == fim[2])) {
					sequencia += palavra.charAt(i);
				}
			} else {
				return null;
			}
			
		}
		if(qtdMeio == 0 || qtdMeio % padrao2.getQtdMinMeio() != 0) {
			sequencia = null;
		}
		return sequencia;
	}
	

	
	
	

}
