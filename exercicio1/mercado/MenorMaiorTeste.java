package exercicio1.mercado;

public class MenorMaiorTeste {

	public static void main(String[] args) {
		Carrinho c = new Carrinho();
		c.addProduto(new Produto("Arroz", 2.50));
		c.addProduto(new Produto("Feijao", 4.80));
		c.addProduto(new Produto("Manteiga", 3.20));
		c.addProduto(new Produto("Açucar", 2.30));
		c.addProduto(new Produto("Sal", 0.90));
		MenorMaior m = new MenorMaior();
		m.encontrar(c.getProdutos());
		
		System.out.println("Produtor com valor maior: " +m.getMaior().getNome()+ "\nvalor: R$ " +m.getMaior().getValor());
		System.out.println("Produtor com valor menor: " +m.getMenor().getNome()+ "\nvalor: R$ " +m.getMenor().getValor());

	}

}
