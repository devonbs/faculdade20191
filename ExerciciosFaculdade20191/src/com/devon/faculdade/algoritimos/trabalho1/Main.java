package com.devon.faculdade.algoritimos.trabalho1;

public class Main {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html>\r\n");
		sb.append("<html>\r\n");
		sb.append("<body>\r\n");
		sb.append("<h1>\r\n");
		sb.append("cabeçalho do arquivo\r\n");
		sb.append("<a href=\"vá se foder\">link</a>");
		sb.append("</h1>\r\n");
		sb.append("<p>\r\n");
		sb.append("paragrafo de pagina\r\n");
		sb.append("</p>\r\n");
		sb.append("<p>\r\n");
		sb.append("segundo paragrafo\r\n");
		sb.append("</p>\r\n");
		sb.append("</body>\r\n");
		sb.append("</html>\r\n");
		
		String teste = sb.toString();
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
				}
				
				if(tagFecha) {
					tagFechamento = verificaTagFechameto(tagFormatada);
					if(pilha.peek().equals(tagFechamento)) {
						tagsFormatadas.inserir(pilha.pop());
					} else {
						//throw new RuntimeException("Esperava tag " + pilha.peek() + " - Encontrou - " + tagFormatada);
					}
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
		System.out.println(pilha.toString());
		System.out.println("tags formatadas");
		tagsFormatadas.exibir();
		System.out.println("tags singleton");
		tagsSingleton.exibir();
		return tagFormatada;
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
}
