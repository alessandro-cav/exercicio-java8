package br.com.exercicio.teste;

import java.util.function.Consumer;

import br.com.exercicio.modelo.Produto;
import br.com.exercicio.repository.ProdutoRepository;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		ProdutoRepository repository = new ProdutoRepository();
		
		Consumer<Produto> mensagemAntes = p -> System.out.println("Imprimindo os Produtos da loja.");
		
		Consumer<Produto> imprimeProduto = p -> System.out.println(p.toString());
		
		repository.findAll().forEach(mensagemAntes.andThen(imprimeProduto));
	}

}
