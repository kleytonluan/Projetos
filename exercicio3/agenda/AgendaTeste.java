package projetos.exercicio3.agenda;

public class AgendaTeste {

	public static void main(String[] args) {
		AgendaTelefonica a = new AgendaTelefonica();
		a.inserir("Luan", "9912-8867");
		a.inserir("kleyton", "3422-8011");
		a.inserir("Ramos", "3415-1600");
		a.inserir("De Brito", "9984-5698");
		a.inserir("Carvalho", "0800");
		
		a.exibir();
		a.tamanho();
		System.out.println("Voce tem " +a.ta()+ " contatos na lista ");
		a.remover("Luan");
		System.out.println("Voce tem " +a.ta()+ " contatos na lista ");

	}

}
