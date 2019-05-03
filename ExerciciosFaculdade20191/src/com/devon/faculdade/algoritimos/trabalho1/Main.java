package com.devon.faculdade.algoritimos.trabalho1;

public class Main {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
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
		boolean abriu = false;
		PilhaVetor<String> pilha = new PilhaVetor<String>(10000);
		char caracter;
		for (int i = 0; i < tag.length(); i++) {
			caracter = tag.charAt(i);
			if(caracter == '<') {
				tagFormatada += caracter;
				abriu = true;
				continue;
			} 
			if(abriu && (caracter == ' ' || caracter == '>')) {
				tagFormatada += '>';
				pilha.push(tagFormatada);
				tagFormatada = "";
				abriu = false;
				continue;
			} else if(abriu) {
				tagFormatada += tag.charAt(i);
			}
		}
		System.out.println(pilha.toString());
		return tagFormatada;
	}
}
