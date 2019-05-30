package com.devon.faculdade.algoritimos.exe332;

public class ArvoreBinaria<T> {
	
	private NoArvoreBinaria<T> raiz;

	public ArvoreBinaria() {
		
	}
	
	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}
	
	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}
	
	@Override
	public String toString() {
		if(raiz != null ) {
			return obterRepresentacaoTextual(raiz);
		} else {
			return "";
		}
	}
	
	private String obterRepresentacaoTextual(NoArvoreBinaria<T>  no) {
		NoArvoreBinaria<T> p;
		String s = "<";
		s += no.getInfo();
		
		p = no.getPrimeiro();
		while(p != null) {
			s+= obterRepresentacaoTextual(p);
			p = p.getProximo();
		}
		
		s += ">";
		
		return s;
	}
	
	public boolean pertence(T info) {
		if(raiz == null) {
			return false;
		} else {
			return pertence(raiz, info);
		}
	}
	
	public boolean pertence(NoArvoreBinaria<T> no, T info) {
		if(no.getInfo().equals(info)) {
			return true;
		} else {
			NoArvoreBinaria<T> p;
			
			p = no.getPrimeiro();
			while(p != null) {
				if(pertence(p, info)) {
					return true;
				}
				p = p.getProximo();
			}
		}
		return false;
	}
	
	public NoArvoreBinaria<T> buscar(T info) {
		if(raiz == null) {
			return null;
		} else {
			return buscar(raiz, info);
		}
	}
	
	public NoArvoreBinaria<T> buscar(NoArvoreBinaria<T> no, T info) {
		if(no.getInfo().equals(info)) {
			return no;
		} else {
			NoArvoreBinaria<T> p = no.getPrimeiro();
			
			while(p != null) {
				NoArvoreBinaria<T> noLocalizado = buscar(p, info);
				if(noLocalizado != null) {
					return noLocalizado;
				} else {
					p = p.getProximo();
				}
			}
		}
		return null;
	}
	
	public int contarNos() {
		if(raiz == null) {
			return 0;
		} else {
			return contarNos(getRaiz());
		}
	}
	
	private int contarNos(NoArvoreBinaria<T> no) {
		int qtd = 1;
		NoArvoreBinaria<T> p = no.getPrimeiro();
		while(p != null) {
			qtd += contarNos(p);
			p = p.getProximo();
		}
		
		return qtd;
	}
	
	
}
