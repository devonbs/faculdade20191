/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devon.faculdade.testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Eliton
 */
public class AnalisadorTexto {
    
    private File file;
    private HashMap<Integer, Municipio> dados = new HashMap();
    
    public void carregarArquivo(File file) throws FileNotFoundException {
        setFile(file);
        processar();
    }
    
    private void setFile(File file) {
        this.file = file;
    }
    
    private void processar() throws FileNotFoundException {
        Scanner scanner = new Scanner(file,"UTF-8");
        run();
        while (scanner.hasNext()) {
            String leitura = scanner.nextLine();
            
            String[] split = new String[3];
            split = leitura.split(";");
            
            String teste = split[0];
            int t = Integer.parseInt(teste.trim());
            int a = 1 + 1;
        }
        
    }
    
    public void run() {

        String arquivoCSV = "C:\\Users\\Devon\\Downloads\\municipios.txt";
        BufferedReader br = null;
        String linha = "";
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

            	 String[] split = new String[3];
                 split = linha.split(";");
                 
                 String teste = split[0];
                 int t = Integer.parseInt(teste.trim());
                 int a = 1 + 1;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
      }
    
    
    
    public Municipio buscarMunicipiosPorCodigoIbge(int codigo) {
        Municipio m = dados.get(codigo);
        return m;
    }
    
    private void criarMunicipio(int codigoIbge, String cidade, String estado, long populacao) {
        Municipio municipio = new Municipio(codigoIbge, cidade, populacao, estado);
    }
    
    private void inserirMunicipioEstrutura(Municipio m) {
        dados.put(m.getCodigoIbge(), m);
    }
}
