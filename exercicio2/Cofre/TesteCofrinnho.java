package exercicio2.Cofre;

public class TesteCofrinnho {

	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		c.add(new Moeda(0.10));
		c.add(new Moeda(0.50));
		c.add(new Moeda(0.25));
		c.add(new Moeda(1.00));
		c.add(new Moeda(1.00));
		c.add(new Moeda(1.00));

		System.out.println("\nValor total no cofre: " + c.calcularTotal());
		System.out.println("\nNumero de moedas no cofre: " + c.getNumeroMoedas());
		System.out.println("\nMoeda de maior valor: " + c.MaiorValor());
		System.out.println("\nNumero de moedas de R$ 1.00: "+ c.getMoedasDeValor(1.00));
	}

}
