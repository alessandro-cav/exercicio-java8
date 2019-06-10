package br.com.exercicio.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.exercicio.modelo.Produto;

public class ProdutoRepository {

	private static List<Produto> produtos = new ArrayList<Produto>();

	private static int count = 1;

	static {

		produtos.add(new Produto(count++, "cavaco", 125.63, 369, true));
		produtos.add(new Produto(count++, "carro", 1225.63, 0, false));
		produtos.add(new Produto(count++, "livro do amanhacer", 365.95, 369, true));
		produtos.add(new Produto(count++, "vidro", 25.63, 369, false));
		produtos.add(new Produto(count++, "cola", 5.63, 0, true));
		produtos.add(new Produto(count++, "bala", 0.63, 369, true));

	}

	public List<Produto> findAll() {
		return produtos;
	}

}
