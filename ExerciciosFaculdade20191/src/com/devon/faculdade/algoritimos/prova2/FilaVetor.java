package com.devon.faculdade.algoritimos.prova2;

public class FilaVetor<T> implements Fila<T>{

    private T info[];
    private int limite;
    private int tamanho;
    private int inicio;
    
    public FilaVetor(int limite){
        info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }
    
    @Override
    public void inserir(T valor) {
        if(tamanho==limite)
            throw new FilaCheiaException("Fila esta cheia.");
        int posicaoInserir = (inicio+tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }
    
    @SuppressWarnings("unchecked")
	public void encolher() {
    	int novoTamanho = 0;
    	 T[] novoInfo = (T[]) new Object[tamanho];
    	 for (int i = 0; i <= novoInfo.length; i++) {
    		T infoRetirar = null;
    		try {
				infoRetirar = this.retirar();
			} catch (FilaVaziaException e) {}
    		if(infoRetirar != null) {
    			novoInfo[i] = infoRetirar;
    			novoTamanho++;
    		}
		}
    	info = novoInfo;
    	inicio = 0;
    	tamanho = novoTamanho;
    }

    @Override
    public boolean estaVazia() {
        return tamanho==0;
    }

    @Override
    public T peek() {
        if(estaVazia())
            throw new FilaVaziaException("Fila esta vazia.");
        return info[inicio];
    }

    @Override
    public T retirar() {
        T valor = peek();
        info[inicio] = null;
        inicio = (inicio+1)%limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho=0;
        inicio=0;
    }
    
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2){
        FilaVetor<T> concatenada = new FilaVetor<T>(this.tamanho + f2.tamanho);
        int contador = 0;
        int tempInicio = inicio;
        while(contador < tamanho){
            T valor = info[tempInicio];
            tempInicio = (tempInicio+1)%limite;
            concatenada.inserir(valor);
            contador++;
        }
        contador=0;
        tempInicio = f2.inicio;
        while(contador < f2.tamanho){
            T valor = f2.info[tempInicio];
            tempInicio = (tempInicio+1)%limite;
            concatenada.inserir(valor);
            contador++;
        }
        return concatenada;
    }
    
    public String toString(){
    	String resultado = "";

        int indice = inicio;
        for (int i = inicio; i < inicio+tamanho; i++) {
            if (i > 0) {
                resultado += ",";
            }
            resultado += info[i];
            indice = (indice + 1) % limite;
        }

        return resultado;
    }
}
