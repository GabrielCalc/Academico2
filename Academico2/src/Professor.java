
public class Professor {
	
	//Atributos
	private String nome;
	private String matr�cula;
	private String titulacao;
	private String CPF;
	
	
	public Professor(String nome, String matr�cula, String titula��o, String cPF) {
		super();
		this.nome = nome;
		this.matr�cula = matr�cula;
		this.titulacao = titula��o;
		CPF = cPF;
		
	}
	@Override
	public String toString() {
		return "Professor [nome: " + nome + ", matr�cula: " + matr�cula + ", titula��o: " + titulacao + ", CPF: " + CPF
				+ "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatr�cula() {
		return matr�cula;
	}
	public void setMatr�cula(String matr�cula) {
		this.matr�cula = matr�cula;
	}
	public String getTitula��o() {
		return titulacao;
	}
	public void setTitula��o(String titula��o) {
		this.titulacao = titula��o;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	

}
