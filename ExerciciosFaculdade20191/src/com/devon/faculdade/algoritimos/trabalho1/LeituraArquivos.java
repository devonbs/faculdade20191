package com.devon.faculdade.algoritimos.trabalho1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.nio.file.Path;

public class LeituraArquivos {

	public static String carregarArquivo(Path path){
        String arquivoHtml;
        try {	
        	InputStream is = new FileInputStream(path.toFile().getName());
        	BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        	
        	String linha = bf.readLine();
        	StringBuilder sb = new StringBuilder();
        	
        	while(linha != null) {
        		sb.append(linha);
        		linha = bf.readLine();
        	}
        	arquivoHtml = sb.toString();
        } catch (FileNotFoundException fileNotFoundException){
            arquivoHtml = "Arquivo não encontrado";
        } catch (IOException ioException){
            arquivoHtml = "Arquivo não encontrado";
        } catch (Exception e) {
        	arquivoHtml = "Arquivo não encontrado";
        }
        return arquivoHtml;
}
	
}
