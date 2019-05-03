package com.devon.faculdade.linguagens.trabalho3;

public class EstruturaPalavra {
	
	private String inicio;
	private Integer qtdMinInicio;
	private String meio;
	private Integer qtdMinMeio;
	private String fim;
	private Integer qtdMinFim;
	private boolean aceita;
	
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public Integer getQtdMinInicio() {
		return qtdMinInicio;
	}
	public void setQtdMinInicio(Integer qtdMinInicio) {
		this.qtdMinInicio = qtdMinInicio;
	}
	public String getMeio() {
		return meio;
	}
	public void setMeio(String meio) {
		this.meio = meio;
	}
	public Integer getQtdMinMeio() {
		return qtdMinMeio;
	}
	public void setQtdMinMeio(Integer qtdMinMeio) {
		this.qtdMinMeio = qtdMinMeio;
	}
	public String getFim() {
		return fim;
	}
	public void setFim(String fim) {
		this.fim = fim;
	}
	public Integer getQtdMinFim() {
		return qtdMinFim;
	}
	public void setQtdMinFim(Integer qtdMinFim) {
		this.qtdMinFim = qtdMinFim;
	}
	public boolean isAceita() {
		return aceita;
	}
	public void setAceita(boolean aceita) {
		this.aceita = aceita;
	}
	
	
}
