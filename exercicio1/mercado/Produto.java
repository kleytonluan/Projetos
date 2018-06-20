package exercicio1.mercado;

public class Produto {
	public String nome;
	public double valor;
	public String getNome() {
		return nome;
	}
	public double getValor() {
		return valor;
	}
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
}
