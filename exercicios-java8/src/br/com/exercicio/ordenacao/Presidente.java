package br.com.exercicio.ordenacao;

public class Presidente {
	
	String nome; 
    int inicio; 
    int fim; 
    public Presidente(String n, int i, int f) {
        nome = n; inicio = i; fim = f;
    }
    public String toString() {
        return nome + ": de " + inicio + " até " + fim;
    }


}
