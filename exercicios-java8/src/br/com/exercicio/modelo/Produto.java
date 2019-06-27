package br.com.exercicio.modelo;

public class Produto implements Comparable<Produto> {

	private int codigo;

	private String nome;

	private double preco;

	private int quantidade;

	private boolean status;

	public Produto(int codigo, String nome, double preco, int quantidade, boolean status) {

		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.status = status;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ ", status=" + status + "]";
	}


	@Override
	public int compareTo(Produto o) {
		
		/*
		 * Será negativo, caso o tamanho o.getNome for menor do que this.nome
		 * Será positivo, caso o this.nome for maior que o.getNome
		 * Será zero, caso ambas serem identicas
		 * */
		
		 int x = this.nome.compareToIgnoreCase(o.getNome());
		 
		 System.out.println(x);
		return x;
	}

}
