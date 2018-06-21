package projetos.exercicio1.mercado;

public class MenorMaiorTeste {
	public static void main(String[] args) {

	Carrinho c = new Carrinho();
	c.addProduto(new Produto("Garrafa1", 5.80));
	c.addProduto(new Produto("Garrafa2", 5.80));
	c.addProduto(new Produto("Garrafa3", 5.80));
	c.addProduto(new Produto("Garrafa4", 5.79));
	c.addProduto(new Produto("Garrafa5", 6.80));
	MenorMaior m = new MenorMaior();
	m.encontrar(c.getProdutos());
	
	System.out.println("Produto maior valor: " +m.getMaior().getNome());
	System.out.println("Produto menor valor: " +m.getMenor().getNome());
	
	
	}
	
}
/*
	System.out.println("Produtor com valor maior: " +m.getMaior().getNome()+ "\nvalor: R$ " +m.getMaior().getValor());
	System.out.println("Produtor com valor menor: " +m.getMenor().getNome()+ "\nvalor: R$ " +m.getMenor().getValor());

	}

}
*/