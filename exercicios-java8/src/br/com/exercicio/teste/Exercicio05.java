package br.com.exercicio.teste;

import br.com.exercicio.repository.ProdutoRepository;

public class Exercicio05 {

	public static void main(String[] args) {

		// MOstar todos os produtos com valor acima de 100 reais
		
		ProdutoRepository repository = new ProdutoRepository();

		repository.findAll().removeIf(p -> p.getPreco() < 100);
		
		repository.findAll().forEach(p -> System.out.println(p.toString()));
	}

}
