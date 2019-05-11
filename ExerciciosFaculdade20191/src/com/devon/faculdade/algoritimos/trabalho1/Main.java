package com.devon.faculdade.algoritimos.trabalho1;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

public class Main {
	
	
	
	public static void main(String[] args)  {
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
		JFileChooser escolher = new JFileChooser();
		escolher.showOpenDialog(null);	
		
		final Path path = Paths.get(escolher.getSelectedFile().getAbsolutePath());
		String dados = LeituraArquivos.carregarArquivo(path);
		Main main = new Main();
		main.lerStringTag(dados);
		
		
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
		
		if (!pilha.estaVazia()){
			System.out.println("Tags não encontradas");
			for (int i = 0; i < pilha.getTamanho(); i++) {
				System.out.println(tagFechamentoNaoEncontrada(pilha.pop()));
			}
		}
		
		if (!tagsSingleton.estaVazia()) {
			imprimeTags(tagsSingleton);
		}
		if (!tagsFormatadas.estaVazia()) {
			exibirTagsFormatadas(tagsFormatadas);
			contarTagsRepetidas(tagsFormatadas);
		}
		
		return tagFormatada;
	}

	private void imprimeTags(ListaEstatica<String> tags) {
		System.out.println("tags singleton");
		tags.exibir();
	}

	private void exibirTagsFormatadas(ListaEstatica<String> tagsFormatadas) {
		System.out.println("tags formatadas");
		System.out.println(tagsFormatadas.toString());
	}
	
	private void contarTagsRepetidas(ListaEstatica<String> tagsFormatadas) {
		ListaEstatica<String> tagsContadas = new ListaEstatica<String>();
		boolean existe = false;
		int quantidade = 0;
		System.out.println("Contar TAGS Repetidas");
		for (int i = 0; i < tagsFormatadas.getTamanho(); i++) {
			for (int j = 0; j < tagsContadas.getTamanho(); j++) {
				if(tagsContadas.obterElemento(i).equals(tagsFormatadas.obterElemento(j))) {
					existe = true;
				} else {
					tagsContadas.inserir(tagsFormatadas.obterElemento(i));
				}
				quantidade++;
			}
			System.out.println(tagsFormatadas.obterElemento(i) + " " + quantidade);
			quantidade = 0;
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
