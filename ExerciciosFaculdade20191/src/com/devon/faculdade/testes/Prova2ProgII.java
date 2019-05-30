/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devon.faculdade.testes;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Eliton
 */
public class Prova2ProgII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        AnalisadorTexto analisador = new AnalisadorTexto();
        analisador.carregarArquivo(new File("C:\\Users\\Devon\\Downloads\\municipios.txt"));
    }

}
