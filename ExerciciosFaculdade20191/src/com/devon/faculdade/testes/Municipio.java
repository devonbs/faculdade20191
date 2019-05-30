/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devon.faculdade.testes;

/**
 *
 * @author Eliton
 */
public class Municipio {

    private int codigoIbge;
    private String cidade;
    private long populacao;
    private String estado;

    public Municipio(int codigoIbge, String cidade, long populacao, String estado) {
        this.codigoIbge = codigoIbge;
        this.cidade = cidade;
        this.populacao = populacao;
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codigoIbge;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Municipio other = (Municipio) obj;
        if (this.codigoIbge != other.codigoIbge) {
            return false;
        }
        return true;
    }
    

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String nome) {
        this.cidade = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
