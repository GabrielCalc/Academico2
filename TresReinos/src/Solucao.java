import java.util.ArrayList;

public class Solucao {
	// Metodo para questão A
	public int getQtdeTotal(String recurso, ArrayList<Governante> governantes){
		//Testar o tipo de recurso
		int resultado = 0;
		
		switch (recurso) {
		case "ouro":
			for (int i = 0; i < governantes.size(); i++){
				resultado = resultado + governantes.get(i).getOuro();
			}
			return resultado;

		case "madeira":
				for (int i = 0; i < governantes.size(); i++){
					resultado = resultado + governantes.get(i).getMadeira();
				}
			return resultado;
			
		case "água":
				for (int i = 0; i < governantes.size(); i++){
					resultado = resultado + governantes.get(i).getAgua();
				}
			return resultado;
			
			default:
				return resultado;
		}
	}
	
	// Metodo para questão B
	public String getQtdeFicarVivo (String nomeGovernante, ArrayList<Governante> governantes){
		//buscar o governante na lista
		String resultado = "";
		for (int i = 0; i < governantes.size(); i++) {
			if (governantes.get(i).getNome().equals(nomeGovernante)) {
				resultado = "Pedido do governante: " + nomeGovernante + "\n" +
			"Ouro: " + governantes.get(i).getPedidoOuro() + "\n" +
			"Madeira: " + governantes.get(i).getPedidoMadeira() + "\n" +
			"Água: " + governantes.get(i).getPedidoAgua();
				
			}
		}
		return resultado;
	}
	//Metodo para questão C
	public int calcularQtdeViagens(String nomeGovernante, ArrayList<Governante> governantes){
		
		int resultado = 0;
		
		//buscar o governante na lista com base no nome
		for (int i = 0; i < governantes.size(); i++){
			if (governantes.get(i).getNome().equals(nomeGovernante)){
				resultado = (governantes.get(i).getPedidoOuro() / 50) +
						(governantes.get(i).getPedidoMadeira() / 100) +
						(governantes.get(i).getPedidoAgua() / 1000);
				
			}
		}
		return resultado; 
	}
	
}
