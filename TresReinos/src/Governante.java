
public class Governante {
	//Atributos
	private int ouro;
	private int madeira;
	private int agua;
	private String nome;
	private int pedidoOuro;
	private int pedidoMadeira;
	private int pedidoAgua;



	public Governante(int ouro, int madeira, int agua, String nome, int pedidoOuro, int pedidoMadeira, int pedidoAgua) {
		super();
		this.ouro = ouro;
		this.madeira = madeira;
		this.agua = agua;
		this.nome = nome;
		this.pedidoOuro = pedidoOuro;
		this.pedidoMadeira = pedidoMadeira;
		this.pedidoAgua = pedidoAgua;
	}
	
	public int getPedidoOuro() {
		return pedidoOuro;
	}
	public void setPedidoOuro(int pedidoOuro) {
		this.pedidoOuro = pedidoOuro;
	}
	public int getPedidoMadeira() {
		return pedidoMadeira;
	}
	public void setPedidoMadeira(int pedidoMadeira) {
		this.pedidoMadeira = pedidoMadeira;
	}
	public int getPedidoAgua() {
		return pedidoAgua;
	}
	public void setPedidoAgua(int pedidoAgua) {
		this.pedidoAgua = pedidoAgua;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getOuro() {
		return ouro;
	}
	public void setOuro(int ouro) {
		this.ouro = ouro;
	}
	public int getMadeira() {
		return madeira;
	}
	public void setMadeira(int madeira) {
		this.madeira = madeira;
	}
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}

}
