package projetos.exercicio3.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonica {
	private Map<String, String> colecao = new HashMap<String, String>();

	public void inserir(String nome, String numero) {
		colecao.put(nome, numero);
	}

	public void exibir() {
		System.out.println("===========Agenda===========");
		for (Map.Entry<String, String> i : colecao.entrySet()) {
			System.out.println(" Nome: " + i.getKey() + " Numero: " +i.getValue());
		}
	}
	public int ta() {
		return colecao.size();
	}
	public void tamanho() {
		int cont = 0;
		for (String i : colecao.keySet()) {
			i.length();
			cont++;
		}
		System.out.println("Voce tem "+ cont+ " contatos na lista");
	}
	public void remover(String nome) {
		colecao.remove(nome);
	}

	public void buscarNumero(String numero) {
		for (String i : colecao.values()) {
			if (i.equals(numero)) {
				System.out.println("O numero " + i + " está na lista");
			}
		}
	}
}



