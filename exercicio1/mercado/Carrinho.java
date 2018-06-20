package exercicio1.mercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	List<Produto> produtos;
	public Carrinho() {
		produtos = new ArrayList<>();
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
}
