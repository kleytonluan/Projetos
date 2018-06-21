package projetos.exercicio2.Cofre;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	List<Moeda> Moeda;
	public Cofrinho() {
		this.Moeda = new ArrayList<Moeda>();
	}
//-------------------------------------------------
	public void add(Moeda m) {
		Moeda.add(m);
	}
//-------------------------------------------------

	public double calcularTotal() {
		double total = 0;
		for (Moeda moeda : Moeda) {
			total += moeda.getValor();
		}
		return total;
	}
//-------------------------------------------------
	public int getNumeroMoedas() {
		return Moeda.size();
	}
//-------------------------------------------------
	public int getMoedasDeValor(double valor) {
		int c = 0;
		for (Moeda moeda : Moeda) {
			if (moeda.getValor() == valor) {
				c++;
			}
		}
	return c;
	}
//-------------------------------------------------
	public double MaiorValor() {
		double maior = Double.NEGATIVE_INFINITY;
		for (Moeda Moeda : Moeda) {
			if(Moeda.getValor()>maior) {
				maior = Moeda.getValor();
			}
		}
	return maior;
	}
}
