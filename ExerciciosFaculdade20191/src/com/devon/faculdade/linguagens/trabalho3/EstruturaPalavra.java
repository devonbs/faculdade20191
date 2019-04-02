package com.devon.faculdade.linguagens.trabalho3;

import java.util.ArrayList;

public class EstruturaPalavra {
	
	private String palavra;
	private ArrayList<String> lSucessor;
	private Integer quantiadeMinima;
	
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public ArrayList<String> getlSucessor() {
		return lSucessor;
	}
	public void setlSucessor(ArrayList<String> lSucessor) {
		this.lSucessor = lSucessor;
	}
	public Integer getQuantiadeMinima() {
		return quantiadeMinima;
	}
	public void setQuantiadeMinima(Integer quantiadeMinima) {
		this.quantiadeMinima = quantiadeMinima;
	}
	
	
	
}
