import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// Instanciar os 3 governantes
		Governante montante = new Governante( 5000, 4000, 20000, "Montante", 0, 20000, 40000);
		Governante lenha = new Governante( 500, 25000, 10000, "Lenha", 0, 0, 100000 );
		Governante clareza = new Governante(200, 7000, 120000, "Clareza", 5000, 10000, 0);
		
		// lista de governantes
		ArrayList<Governante> governantes = new ArrayList<Governante>();
		governantes.add(montante);
		governantes.add(lenha);
		governantes.add(clareza);
		
		//instanciar a classe Solucao
		Solucao s = new Solucao();
		
		//Imprimir resultados da questão A
		System.out.println("Ouro: " + s.getQtdeTotal("ouro", governantes) + " Quilos");
		System.out.println("Água: " +s.getQtdeTotal("água", governantes) + " Litros");
		System.out.println("Madeira: " + s.getQtdeTotal("madeira", governantes) + " Toras");
		
		//Imprimir resultado questão B
		System.out.println(s.getQtdeFicarVivo("Montante", governantes));
		System.out.println(s.getQtdeFicarVivo("Lenha", governantes));
		System.out.println(s.getQtdeFicarVivo("Clareza", governantes));
		
		//Imprimir resultado questão C
		System.out.println(s.calcularQtdeViagens("Montante", governantes) + " Viagens");
		System.out.println(s.calcularQtdeViagens("Lenha", governantes) + " Viagens");
		System.out.println(s.calcularQtdeViagens("Clareza", governantes) + " Viagens");
	}

}
