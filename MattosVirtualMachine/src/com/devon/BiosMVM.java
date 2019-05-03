package com.devon;


import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author
 */
public class BiosMVM implements ISet {
  
     /*
    Recebe um objeto do tipo CPU , um objeto do tipo memoria, o numero do 
    programa no BIOS a ser executado e o numero maximo de instrucoes a executar
    (para prevenir loops infinitos)
    */
    public BiosMVM(CpuMVM _cpu,MemoriaMVM _mem,int programa,int maxInstrucoes,int enderecoDeCarga) {
        String BIOS = "BIOS VERSAO 2018-10-01 20:00";

        System.out.println(BIOS);

        switch (programa) {
            case 0:
                _mem.m[0] = ISet._initAx;
                _mem.m[1] = ISet._moveAx_Valor;
                _mem.m[2] = 3;
                _mem.m[3] = ISet._incAx;
                _mem.m[4] = ISet._moveEnd_Ax;
                _mem.m[5] = 2;
                _mem.m[6] = ISet._halt;
                break; 
            case 1:
                _mem.m[0] = 0;
                _mem.m[1] = 19;
                _mem.m[2] = 19;
                _mem.m[3] = 19;
                _mem.m[4] = 19;
                _mem.m[5] = 19;
                _mem.m[6] = 40;
                break;
            case 2:
            	_mem.m[0] = 0;
                _mem.m[1] = 44;
                _mem.m[2] = 3;
                _mem.m[3] = 19;
                _mem.m[4] = 9;
                _mem.m[5] = 2;
                _mem.m[6] = 40;
                
                break;
            case 3:
            	_mem.m[0] = 0;
                _mem.m[1] = 3;
                _mem.m[2] = 29;
                _mem.m[3] = 20;
                _mem.m[4] = 20;
                _mem.m[5] = 22;
                _mem.m[6] = 25;
                _mem.m[7] = 10;
                _mem.m[8] = 26;
                _mem.m[9] = 3;
                _mem.m[10] = 40;
                
                break;
            case 4:
            	_mem.m[0] = 0;
                _mem.m[1] = 19;
                _mem.m[2] = 19;
                _mem.m[3] = 9;
                _mem.m[4] = 12;
                _mem.m[5] = 19;
                _mem.m[6] = 19;
                _mem.m[7] = 3;
                _mem.m[8] = 5;
                _mem.m[9] = 12;
                _mem.m[10] = 40;
                
                break;
            case 5:
            	_mem.m[0] = 26;
                _mem.m[1] = 16;
                _mem.m[10] = 0;
                _mem.m[11] = 9;
                _mem.m[12] = 2;
                _mem.m[13] = 9;
                _mem.m[14] = 3;
                _mem.m[15] = 28;
                _mem.m[16] = 0;
                _mem.m[17] = 44;
                _mem.m[18] = 9;
                _mem.m[19] = 48;
                _mem.m[20] = 0;
                _mem.m[21] = 27;
                _mem.m[22] = 10;
                _mem.m[23] = 27;
                _mem.m[24] = 10;
                _mem.m[25] = 40;
                break;
                
            case 6:
            	_mem.m[0] = 26;
            	_mem.m[1] = 17;
            	_mem.m[10] = 19;
            	_mem.m[11] = 9;
            	_mem.m[12] = 2;
            	_mem.m[13] = 0;
            	_mem.m[14] = 9;
            	_mem.m[15] = 3;
            	_mem.m[16] = 28;
            	_mem.m[17] = 0;
            	_mem.m[18] = 44;
            	_mem.m[19] = 9;
            	_mem.m[20] = 48;
            	_mem.m[21] = 0;
            	_mem.m[22] = 27;
            	_mem.m[23] = 10; 
            	_mem.m[24] = 27; 
            	_mem.m[25] = 10; 
            	_mem.m[26] = 40;
            	
            	break;
            case 7:
            	_mem.m[0] = 26;
            	_mem.m[1] = 18;
            	_mem.m[10] = 11;
            	_mem.m[11] = 8;
            	_mem.m[12] = 2;
            	_mem.m[13] = 19;
            	_mem.m[14] = 19;
            	_mem.m[15] = 8;
            	_mem.m[16] = 2;
            	_mem.m[17] = 28;
            	_mem.m[18] = 0;
            	_mem.m[19] = 44;
            	_mem.m[20] = 5;
            	_mem.m[21] = 48;
            	_mem.m[22] = 44;
            	_mem.m[23] = 2;
            	_mem.m[24] = 31;
            	_mem.m[25] = 27;
            	_mem.m[26] = 10;
            	_mem.m[27] = 37;
            	_mem.m[28] = 44;
            	_mem.m[29] = 3;
            	_mem.m[30] = 31;
            	_mem.m[31] = 27;
            	_mem.m[32] = 10;
            	_mem.m[33] = 36;
            	_mem.m[34] = 40;
            	break;
            	
            case 8:
            	_mem.m[0] = 26;
            	_mem.m[1] = 17;
            	_mem.m[10] = 19;
            	_mem.m[11] = 39;
            	_mem.m[12] = 39;
            	_mem.m[13] = 19;
            	_mem.m[14] = 9;
            	_mem.m[15] = 3;
            	_mem.m[16] = 51;
            	_mem.m[17] = 0;
            	_mem.m[18] = 44;
            	_mem.m[19] = 9;
            	_mem.m[20] = 48;
            	_mem.m[21] = 0;
            	_mem.m[22] = 44;
            	_mem.m[23] = 10;
            	_mem.m[24] = 9;
            	_mem.m[25] = 2;
            	_mem.m[26] = 26;
            	_mem.m[27] = 26;
            	_mem.m[28] = 40;
            	break;
            	
            case 9:
            	_mem.m[0] = 0;
            	_mem.m[1] = 44;
            	_mem.m[2] = 255;
            	_mem.m[3] = 48;
            	_mem.m[4] = 27;
            	_mem.m[5] = 30;
            	_mem.m[6] = 30;
            	_mem.m[7] = 27;
            	_mem.m[8] = 60;
            	_mem.m[9] = 30;
            	_mem.m[10] = 40;
            	_mem.m[30] = 31;
            	_mem.m[31] = 44;
            	_mem.m[32] = 30;
            	_mem.m[33] = 9;
            	_mem.m[34] = 8;
            	_mem.m[35] = 30;
            	_mem.m[36] = 38;
            	_mem.m[37] = 28;
            	_mem.m[60] = 31;
            	_mem.m[61] = 5;
            	_mem.m[62] = 255;
            	_mem.m[63] = 3;
            	_mem.m[64] = 30;
            	_mem.m[65] = 38;
            	_mem.m[66] = 28;
            	break;
            	
            case 10:
            	_mem.m[0] = ISet._jmp;
            	_mem.m[1] = 35;
            	//_mem.m[20] = 25;
            	_mem.m[25] = ISet._pushAx;
            	_mem.m[26] = ISet._moveAx_Valor;
            	_mem.m[27] = 1027;
            	_mem.m[28] = ISet._outAx;
            	_mem.m[29] = ISet._popAx;
            	_mem.m[30] = ISet._outAx;
            	_mem.m[31] = ISet._iret;
            	_mem.m[35] = ISet._initAx;
            	_mem.m[36] = ISet._moveAx_Valor;
            	_mem.m[37] = 20;
            	_mem.m[38] = ISet._moveSp_Ax;
            	_mem.m[39] = ISet._moveAx_Valor;
            	_mem.m[40] = 25;
            	_mem.m[41] = ISet._moveEnd_Ax;
            	_mem.m[42] = 2;
            	_mem.m[43] = ISet._moveAx_Valor;
            	_mem.m[44] = 79;
            	_mem.m[45] = ISet._int;
            	_mem.m[46] = 2;
            	_mem.m[47] = ISet._moveAx_Valor;
            	_mem.m[48] = 76;
            	_mem.m[49] = ISet._int;
            	_mem.m[50] = 2;
            	_mem.m[51] = ISet._moveAx_Valor; 
            	_mem.m[52] = 65;
            	_mem.m[53] = ISet._int;
            	_mem.m[54] = 2;
            	_mem.m[55] = ISet._halt;
            	
            	break;
            case 11:
                
                break;
                
            case 54:
                _mem.m[0 + enderecoDeCarga] = ISet._jmp;
                _mem.m[1 + enderecoDeCarga] = 35;
                
                //codigo do device driver que executa a SYSTEM CALL
                _mem.m[25 + enderecoDeCarga] = ISet._pushAx; //salva o caractere a ser mostrado
                _mem.m[26 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[27 + enderecoDeCarga] = 1025;                      //seleciona o device
                _mem.m[28 + enderecoDeCarga] = ISet._outAx; 
                _mem.m[29 + enderecoDeCarga] = ISet._popAx;   //restaura o caractere a ser mostrado
                _mem.m[30 + enderecoDeCarga] = ISet._outAx;                
                _mem.m[31 + enderecoDeCarga] = ISet._wait ;  //espera interacao com o usuario
                _mem.m[32 + enderecoDeCarga] = ISet._iret; //retorna da interrupcao
                
                
                //codigo do programa que escreve na "tela" ou "memoria de video
                _mem.m[35 + enderecoDeCarga] = ISet._initAx;
                _mem.m[36 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[37 + enderecoDeCarga] = 20;
                _mem.m[38 + enderecoDeCarga] = ISet._moveSp_Ax; //seta a pilha de execucao
                _mem.m[39 + enderecoDeCarga] = ISet._moveAx_Valor; //endereco inicio device driver video
                _mem.m[40 + enderecoDeCarga] = 25;
                _mem.m[41 + enderecoDeCarga] = ISet._moveEnd_Ax; //seta tabela vetores interrupcao
                _mem.m[42 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere D na posicao (0,0) do monitor
                _mem.m[43 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[44 + enderecoDeCarga] = 0;
                _mem.m[45 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[46 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[47 + enderecoDeCarga] = 0;
                _mem.m[48 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[49 + enderecoDeCarga] = 0;
                _mem.m[50 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[51 + enderecoDeCarga] = 68; //"d"
                _mem.m[52 + enderecoDeCarga] = ISet._int;
                _mem.m[53 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere E na posicao (0,1)
                _mem.m[54 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[55 + enderecoDeCarga] = 0;
                _mem.m[56 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[57 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[58 + enderecoDeCarga] = 1;
                _mem.m[59 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[60 + enderecoDeCarga] = 0;
                _mem.m[61 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[62 + enderecoDeCarga] = 69;  //"e"
                _mem.m[63 + enderecoDeCarga] = ISet._int;
                _mem.m[64 + enderecoDeCarga] = 2;
                //--------------------------- escreve o caractere V na posicao (0,2) do monitor
                _mem.m[65 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[66 + enderecoDeCarga] = 0;
                _mem.m[67 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[68 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[69 + enderecoDeCarga] = 2;
                _mem.m[70 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[71 + enderecoDeCarga] = 0;
                _mem.m[72 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[73 + enderecoDeCarga] = 86; //"v"
                _mem.m[74 + enderecoDeCarga] = ISet._int;
                _mem.m[75 + enderecoDeCarga] = 2;
                //---------------------------- escreve o caractere O na posicao (0,3) do monitor
                _mem.m[76 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[77 + enderecoDeCarga] = 0;
                _mem.m[78 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[79 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[80 + enderecoDeCarga] = 3;
                _mem.m[81 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[82 + enderecoDeCarga] = 0;
                _mem.m[83 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[84 + enderecoDeCarga] = 79;  //"o"
                _mem.m[85 + enderecoDeCarga] = ISet._int;
                _mem.m[86 + enderecoDeCarga] = 2;
                //---------------------------- escreve o caractere N na posicao (0,3) do monitor
                _mem.m[87 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[88 + enderecoDeCarga] = 0;
                _mem.m[89 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[90 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[91 + enderecoDeCarga] = 4;
                _mem.m[92 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[93 + enderecoDeCarga] = 0;
                _mem.m[94 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[95 + enderecoDeCarga] = 78;  //"n"
                _mem.m[96 + enderecoDeCarga] = ISet._int;
                _mem.m[97 + enderecoDeCarga] = 2;
                //----------------------------- apaga a tela
                
                //----------------------------- escreve o caractere espaco na posicao (0,0) do monitor
                _mem.m[98 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[99 + enderecoDeCarga] = 0;
                _mem.m[100 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[101 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[102 + enderecoDeCarga] = 0;
                _mem.m[103 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[104 + enderecoDeCarga] = 0;
                _mem.m[105 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[106 + enderecoDeCarga] = 32;
                _mem.m[107 + enderecoDeCarga] = ISet._int;
                _mem.m[108 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere espaco na posicao (0,39)
                _mem.m[109 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[110 + enderecoDeCarga] = 0;
                _mem.m[111 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[112 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[113+ enderecoDeCarga] = 1;
                _mem.m[114 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[115 + enderecoDeCarga] = 0;
                _mem.m[116 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[117 + enderecoDeCarga] = 32;
                _mem.m[118 + enderecoDeCarga] =ISet. _int;
                _mem.m[119 + enderecoDeCarga] = 2;
                //---------------------------- escreve o caractere espaco na posicao (4,0) do monitor
                _mem.m[120 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[121 + enderecoDeCarga] = 0;
                _mem.m[122 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[123 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[124 + enderecoDeCarga] = 2;
                _mem.m[125 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[126 + enderecoDeCarga] = 0;
                _mem.m[127 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[128 + enderecoDeCarga] = 32;
                _mem.m[129 + enderecoDeCarga] = ISet._int;
                _mem.m[130 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere espaco na posicao (4,39) do monitor
                _mem.m[131 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[132 + enderecoDeCarga] = 0;
                _mem.m[133 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[134 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[135 + enderecoDeCarga] = 3;
                _mem.m[136 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[137 + enderecoDeCarga] = 0;
                _mem.m[138 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[139 + enderecoDeCarga] = 32;
                _mem.m[140 + enderecoDeCarga] = ISet._int;
                _mem.m[141 + enderecoDeCarga] = 2;
                
                _mem.m[142 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[143 + enderecoDeCarga] = 0;
                _mem.m[143 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[144 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[145 + enderecoDeCarga] = 4;
                _mem.m[146 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[147 + enderecoDeCarga] = 0;
                _mem.m[148 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[149 + enderecoDeCarga] = 32;
                _mem.m[150 + enderecoDeCarga] = ISet._int;
                _mem.m[151 + enderecoDeCarga] = 2;
                
                _mem.m[152 + enderecoDeCarga] = ISet._halt;
                break;
                
            case 55:
                _mem.m[0 + enderecoDeCarga] = ISet._jmp;
                _mem.m[1 + enderecoDeCarga] = 35;
                
                //codigo do device driver que executa a SYSTEM CALL
                _mem.m[25 + enderecoDeCarga] = ISet._pushAx; //salva o caractere a ser mostrado
                _mem.m[26 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[27 + enderecoDeCarga] = 1025;                      //seleciona o device
                _mem.m[28 + enderecoDeCarga] = ISet._outAx; 
                _mem.m[29 + enderecoDeCarga] = ISet._popAx;   //restaura o caractere a ser mostrado
                _mem.m[30 + enderecoDeCarga] = ISet._outAx;                
                _mem.m[31 + enderecoDeCarga] = ISet._wait ;  //espera interacao com o usuario
                _mem.m[32 + enderecoDeCarga] = ISet._iret; //retorna da interrupcao
                
                
                //codigo do programa que escreve na "tela" ou "memoria de video
                _mem.m[35 + enderecoDeCarga] = ISet._initAx;
                _mem.m[36 + enderecoDeCarga] = ISet._moveAx_Valor;
                _mem.m[37 + enderecoDeCarga] = 20;
                _mem.m[38 + enderecoDeCarga] = ISet._moveSp_Ax; //seta a pilha de execucao
                _mem.m[39 + enderecoDeCarga] = ISet._moveAx_Valor; //endereco inicio device driver video
                _mem.m[40 + enderecoDeCarga] = 25;
                _mem.m[41 + enderecoDeCarga] = ISet._moveEnd_Ax; //seta tabela vetores interrupcao
                _mem.m[42 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere A na posicao (0,0) do monitor
                _mem.m[43 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[44 + enderecoDeCarga] = 0;
                _mem.m[45 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[46 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[47 + enderecoDeCarga] = 0;
                _mem.m[48 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[49 + enderecoDeCarga] = 0;
                _mem.m[50 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[51 + enderecoDeCarga] = 65; //"A"
                _mem.m[52 + enderecoDeCarga] = ISet._int;
                _mem.m[53 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere B na posicao (0,39)
                _mem.m[54 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[55 + enderecoDeCarga] = 0;
                _mem.m[56 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[57 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[58 + enderecoDeCarga] = 39;
                _mem.m[59 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[60 + enderecoDeCarga] = 0;
                _mem.m[61 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[62 + enderecoDeCarga] = 66;  //"B"
                _mem.m[63 + enderecoDeCarga] = ISet._int;
                _mem.m[64 + enderecoDeCarga] = 2;
                //--------------------------- escreve o caractere C na posicao (4,0) do monitor
                _mem.m[65 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[66 + enderecoDeCarga] = 4;
                _mem.m[67 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[68 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[69 + enderecoDeCarga] = 0;
                _mem.m[70 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[71 + enderecoDeCarga] = 0;
                _mem.m[72 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[73 + enderecoDeCarga] = 67; //"C"
                _mem.m[74 + enderecoDeCarga] = ISet._int;
                _mem.m[75 + enderecoDeCarga] = 2;
                //---------------------------- escreve o caractere D na posicao (4,39) do monitor
                _mem.m[76 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[77 + enderecoDeCarga] = 4;
                _mem.m[78 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[79 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[80 + enderecoDeCarga] = 39;
                _mem.m[81 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[82 + enderecoDeCarga] = 0;
                _mem.m[83 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[84 + enderecoDeCarga] = 68;  //"D"
                _mem.m[85 + enderecoDeCarga] = ISet._int;
                _mem.m[86 + enderecoDeCarga] = 2;
                //----------------------------- apaga a tela
                
                //----------------------------- escreve o caractere espaco na posicao (0,0) do monitor
                _mem.m[87 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[88 + enderecoDeCarga] = 0;
                _mem.m[89 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[90 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[91 + enderecoDeCarga] = 0;
                _mem.m[92 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[93 + enderecoDeCarga] = 0;
                _mem.m[94 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[95 + enderecoDeCarga] = 32;
                _mem.m[96 + enderecoDeCarga] = ISet._int;
                _mem.m[97 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere espaco na posicao (0,39)
                _mem.m[98 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[99 + enderecoDeCarga] = 0;
                _mem.m[100 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[101 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[102+ enderecoDeCarga] = 39;
                _mem.m[103 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[104 + enderecoDeCarga] = 0;
                _mem.m[105 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[106 + enderecoDeCarga] = 32;
                _mem.m[107 + enderecoDeCarga] =ISet. _int;
                _mem.m[108 + enderecoDeCarga] = 2;
                //---------------------------- escreve o caractere espaco na posicao (4,0) do monitor
                _mem.m[109 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[110 + enderecoDeCarga] = 4;
                _mem.m[111 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[112 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[113 + enderecoDeCarga] = 0;
                _mem.m[114 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[115 + enderecoDeCarga] = 0;
                _mem.m[116 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[117 + enderecoDeCarga] = 32;
                _mem.m[118 + enderecoDeCarga] = ISet._int;
                _mem.m[119 + enderecoDeCarga] = 2;
                //----------------------------- escreve o caractere espaco na posicao (4,39) do monitor
                _mem.m[120 + enderecoDeCarga] = ISet._moveAx_Valor; //seta linha
                _mem.m[121 + enderecoDeCarga] = 4;
                _mem.m[122 + enderecoDeCarga] = ISet._moveBx_Ax;
                _mem.m[123 + enderecoDeCarga] = ISet._moveAx_Valor; //seta coluna
                _mem.m[124 + enderecoDeCarga] = 39;
                _mem.m[125 + enderecoDeCarga] = ISet._moveCx_Ax;
                _mem.m[126 + enderecoDeCarga] = 0;
                _mem.m[127 + enderecoDeCarga] = ISet._moveAx_Valor; //seta o caractere
                _mem.m[128 + enderecoDeCarga] = 32;
                _mem.m[129 + enderecoDeCarga] = ISet._int;
                _mem.m[130 + enderecoDeCarga] = 2;
                
                _mem.m[131 + enderecoDeCarga] = ISet._halt;
                break;
                
            case 56:
            	_mem.m[0] = ISet._jmp;
            	_mem.m[1] = 10;
            	_mem.m[2] = 204;
            	_mem.m[3] = 219;
            	_mem.m[4] = 234;
            	_mem.m[5] = 249;
            	_mem.m[6] = 0;
            	_mem.m[10] = ISet._moveAx_Valor;
            	_mem.m[11] = 9;
            	_mem.m[12] = ISet._moveEnd_Ax;
            	_mem.m[13] = 0;
            	_mem.m[14] = ISet._moveAx_End;
            	_mem.m[15] = 5;
            	_mem.m[16] = ISet._moveSp_Ax;
            	_mem.m[17] = ISet._iret;
            	_mem.m[19] = ISet._initAx;
            	_mem.m[20] = ISet._moveCx_Ax;
            	_mem.m[21] = ISet._moveAx_End;
            	_mem.m[22] = 6;
            	_mem.m[23] = ISet._moveBx_Ax;
            	_mem.m[24] = ISet._moveAx_Valor;
            	_mem.m[25] = 0;
            	_mem.m[26] = ISet._testAxEqBx;
            	_mem.m[27] = 30;
            	_mem.m[28] = ISet._jmp;
            	_mem.m[29] = 39;
            	_mem.m[30] = ISet._moveCx_Ax;
            	_mem.m[31] = ISet._moveAx_End;
            	_mem.m[32] = 2;
            	_mem.m[33] = ISet._moveSp_Ax;
            	_mem.m[34] = ISet._incCx;
            	_mem.m[35] = ISet._moveAx_Cx;
            	_mem.m[36] = ISet._moveEnd_Ax;
            	_mem.m[37] = 6;
            	_mem.m[38] = ISet._iret;
            	_mem.m[39] = ISet._moveAx_Valor;
            	_mem.m[40] = 1;
            	_mem.m[41] = ISet._testAxEqBx;
            	_mem.m[42] = 45;
            	_mem.m[43] = ISet._jmp;
            	_mem.m[44] = 54;
            	_mem.m[45] = ISet._moveCx_Ax;
            	_mem.m[46] = ISet._moveAx_End;
            	_mem.m[47] = 3;
            	_mem.m[48] = ISet._moveSp_Ax;
            	_mem.m[49] = ISet._incCx;
            	_mem.m[50] = ISet._moveAx_Cx;
            	_mem.m[51] = ISet._moveEnd_Ax;
            	_mem.m[52] = 6;
            	_mem.m[53] = ISet._iret;
            	_mem.m[54] = ISet._initAx;
            	_mem.m[55] = ISet._moveEnd_Ax;
            	_mem.m[56] = 6;
            	_mem.m[57] = ISet._moveAx_End;
            	_mem.m[58] = 4;
            	_mem.m[59] = ISet._moveSp_Ax;
            	_mem.m[60] = ISet._iret;
            	_mem.m[70] = ISet._jmp;
            	_mem.m[71] = 70;
            	_mem.m[74] = ISet._jmp;
            	_mem.m[75] = 74;
            	_mem.m[78] = ISet._jmp;
            	_mem.m[79] = 78;
            	
            	_mem.m[209] = 70;
            	_mem.m[208] = ISet._popBp;
            	_mem.m[207] = ISet._popAx;
            	_mem.m[206] = ISet._popBx;
            	_mem.m[205] = ISet._popCx;
            	
            	_mem.m[224] = 74;
            	_mem.m[223] = ISet._popBp;
            	_mem.m[222] = ISet._popAx;
            	_mem.m[221] = ISet._popBx;
            	_mem.m[220] = ISet._popCx;
            	
            	_mem.m[239] = 78;
            	_mem.m[238] = ISet._popBp;
            	_mem.m[237] = ISet._popAx;
            	_mem.m[236] = ISet._popBx;
            	_mem.m[235] = ISet._popCx;

            	_mem.m[254] = 19;
            	_mem.m[253] = ISet._popBp;
            	_mem.m[252] = ISet._popAx;
            	_mem.m[251] = ISet._popBx;
            	_mem.m[250] = ISet._popCx;
            	
            	break;
            	
            case 57:
            	_mem.m[0]= ISet._jmp;
            	_mem.m[1] = 35;
            	_mem.m[25] = ISet._pushAx;
            	_mem.m[26] = ISet._moveAx_Valor;
            	_mem.m[27] = 5;
            	_mem.m[28] = ISet._outAx;
            	_mem.m[29] = ISet._popAx;
            	_mem.m[30] = ISet._outAx;
            	_mem.m[31] = ISet._iret;
            	_mem.m[35] = ISet._initAx;
            	_mem.m[36] = ISet._moveAx_Valor;
            	_mem.m[37] = 20;
            	_mem.m[38] = ISet._moveSp_Ax;
            	_mem.m[39] = ISet._moveAx_Valor;
            	_mem.m[40] = 25;
            	_mem.m[41] = ISet._moveEnd_Ax;
            	_mem.m[42] = 2;
            	_mem.m[43] = ISet._moveAx_Valor;
            	_mem.m[44] = 79;
            	
            	_mem.m[45] = ISet._int;
            	_mem.m[46] = 2;
            	_mem.m[47] = ISet._moveAx_Valor;
            	_mem.m[48] = 76;
            	_mem.m[49] = ISet._int;
            	_mem.m[50] = 2;
            	_mem.m[51] = ISet._moveAx_Valor;
            	_mem.m[52] = 65;
            	_mem.m[53] = ISet._int;
            	_mem.m[54] = 2;
            	_mem.m[55] = ISet._halt;
            	
            	
            	break;
      
            default:
                programa = 0;
                break;
        }
        _cpu.decodificador(_mem, enderecoDeCarga,maxInstrucoes);
    }
}
