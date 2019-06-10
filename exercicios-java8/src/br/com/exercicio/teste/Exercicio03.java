package br.com.exercicio.teste;

import br.com.exercicio.repository.ProdutoRepository;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		// Mostrar produtos com quantidade igual a zero
		
		ProdutoRepository repository = new ProdutoRepository();
		
		 repository.findAll().removeIf(p -> p.getQuantidade() != 0);
		 
		 repository.findAll().forEach(p -> System.out.println(p.toString()));
		
	}

}
