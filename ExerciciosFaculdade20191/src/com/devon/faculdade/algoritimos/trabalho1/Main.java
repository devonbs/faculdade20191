package com.devon.faculdade.algoritimos.trabalho1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	
	private final static Path path = Paths.get("html.txt");
	
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("<!DOCTYPE html>\r\n");
//		sb.append("<html>\r\n");
//		sb.append("<body>\r\n");
//		sb.append("<h1>\r\n");
//		sb.append("cabeçalho do arquivo\r\n");
//		sb.append("<a href=aaaaaa>link</a>");
//		sb.append("</h1>\r\n");
//		sb.append("<p>\r\n");
//		sb.append("paragrafo de pagina\r\n");
//		sb.append("</p>\r\n");
//		sb.append("<p>\r\n");
//		sb.append("segundo paragrafo\r\n");
//		sb.append("</p>\r\n");
//		sb.append("</body>\r\n");
//		sb.append("</html>\r\n");
		
		//String teste = sb.toString();
		
		String teste = LeituraArquivos.carregarArquivo(path);
		Main main = new Main();
		main.lerStringTag(teste);
		
		
	}
	
	public String lerStringTag(String tag) {
		String tagFormatada = "";
		String tagFechamento = "";
		
		ListaEstatica<String> tagsSingleton = new ListaEstatica<String>();
		ListaEstatica<String> tagsFormatadas = new ListaEstatica<String>();
		
		boolean abriu = false;
		boolean tagFecha = false;
		PilhaVetor<String> pilha = new PilhaVetor<String>(10000);
		char caracter;
		for (int i = 0; i < tag.length(); i++) {
			caracter = tag.charAt(i);
			if(caracter == '<') {
				tagFormatada += caracter;
				abriu = true;
				continue;
			} 
			if(abriu && (caracter == '/')) {
				tagFecha = true;
			}
			
			if(abriu && (caracter == ' ' || caracter == '>')) {
				tagFormatada += '>';
				if(verificaSingletonTag(tagFormatada)) {
					tagsSingleton.inserir(tagFormatada);
					tagFormatada = "";
					abriu = false;
					continue;
				}
				
				if(tagFecha) {
					tagFechamento = verificaTagFechameto(tagFormatada);
					if(pilha.peek().equals(tagFechamento)) {
						tagsFormatadas.inserir(pilha.pop());
					} else {
						throw new RuntimeException("Esperava tag " + pilha.peek() + " - Encontrou - " + tagFormatada);
					}
					tagFormatada = "";
					abriu = false;
					tagFecha = false;
				} else {
					pilha.push(tagFormatada);
					tagFormatada = "";
					abriu = false;
					continue;
				}
			} else if(abriu) {
				tagFormatada += tag.charAt(i);
			}
		}
		
		for (int i = 0; i < pilha.getTamanho(); i++) {
			System.out.println("Tags não encontradas");
			System.out.println(tagFechamentoNaoEncontrada(pilha.pop()));
		}
		System.out.println(pilha.toString());
		System.out.println("tags formatadas");
		exibirTagsFormatadas(tagsFormatadas);
		System.out.println("tags singleton");
		tagsSingleton.exibir();
		return tagFormatada;
	}

	private void exibirTagsFormatadas(ListaEstatica<String> tagsFormatadas) {
		for (int i = 0; i < tagsFormatadas.getTamanho(); i++) {
			
		}
		
	}

	private boolean verificaSingletonTag(String tagFormatada) {
		Object[] singletons = SingletonTags.values();
		for (int i = 0; i < singletons.length; i++) {
			SingletonTags st = (SingletonTags) singletons[i];
			if(st.tag.equals(tagFormatada)) {
				return true;
			}
		}
		return false;
	}

	private String verificaTagFechameto(String tagFormatada) {
		String tag = "";
		for (int i = 0; i < tagFormatada.length(); i++) {
			if(tagFormatada.charAt(i) != '/') {
				tag += tagFormatada.charAt(i);
			}
		}
		return tag;
	}
	
	private String tagFechamentoNaoEncontrada(String tagFormatada) {
		String tag = "";
		for (int i = 0; i < tagFormatada.length(); i++) {
			if(i == 1) {
				tag += '/';
			} 
			tag += tagFormatada.charAt(i);
		}
		return tag;
	}
}
