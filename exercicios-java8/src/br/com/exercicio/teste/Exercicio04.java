package br.com.exercicio.teste;

import br.com.exercicio.repository.ProdutoRepository;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		ProdutoRepository repository = new ProdutoRepository();
		
		repository.findAll().removeIf(p -> p.isStatus() == false);
		
		repository.findAll().forEach(p -> System.out.println(p.toString()));
	}

}
