package projetos.exercicio1.mercado;

import java.util.List;

public class MenorMaior {
	public Produto maior;
	public Produto menor;

	public void encontrar(List<Produto> produtos) {
		double menorValor = Double.POSITIVE_INFINITY;
		double maiorValor = Double.NEGATIVE_INFINITY;
		for(Produto produto : produtos) {
			if(produto.getValor()>maiorValor) {
				this.maior = produto;
				maiorValor = produto.getValor();
			}
			if(produto.getValor()<menorValor) {
				this.menor = produto;
				menorValor = produto.getValor();
			}
		}

	}

	public Produto getMaior() {
		return maior;
	}

	public Produto getMenor() {
		return menor;
	}
}
