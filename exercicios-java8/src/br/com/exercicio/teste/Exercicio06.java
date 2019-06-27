package br.com.exercicio.teste;

import java.util.Collections;
import java.util.List;

import br.com.exercicio.modelo.Produto;
import br.com.exercicio.repository.ProdutoRepository;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		List<Produto> produtos = new ProdutoRepository().findAll();
		
		// ordenação
		Collections.sort(produtos);
	}

}
