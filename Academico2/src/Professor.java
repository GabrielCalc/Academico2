
public class Professor {
	
	//Atributos
	private String nome;
	private String matrícula;
	private String titulacao;
	private String CPF;
	
	
	public Professor(String nome, String matrícula, String titulação, String cPF) {
		super();
		this.nome = nome;
		this.matrícula = matrícula;
		this.titulacao = titulação;
		CPF = cPF;
		
	}
	@Override
	public String toString() {
		return "Professor [nome: " + nome + ", matrícula: " + matrícula + ", titulação: " + titulacao + ", CPF: " + CPF
				+ "]";
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatrícula() {
		return matrícula;
	}
	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}
	public String getTitulação() {
		return titulacao;
	}
	public void setTitulação(String titulação) {
		this.titulacao = titulação;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	

}
