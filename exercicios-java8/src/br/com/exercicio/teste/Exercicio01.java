package br.com.exercicio.teste;

import br.com.exercicio.repository.ProdutoRepository;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		// Mostrar todos os produtos cadastrados
		
		ProdutoRepository repository = new ProdutoRepository();
		
		repository.findAll().forEach(p -> System.out.println(p.toString()));
	}

}
