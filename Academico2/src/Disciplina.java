
public class Disciplina {
	//Atributos
	
	private String nome;
	private String curso;
	private int cargaHor�ria;
	
	
	
	public Disciplina(String nome, String curso, int cargaHor�ria) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.cargaHor�ria = cargaHor�ria;
		
		
		
	}
	@Override
	public String toString() {
		return "Disciplina [nome: " + nome + ", curso: " + curso + ", cargaHor�ria: " + cargaHor�ria + "]";
	}
	
	//M�todos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargaHor�ria() {
		return cargaHor�ria;
	}
	public void setCargaHor�ria(int cargaHor�ria) {
		this.cargaHor�ria = cargaHor�ria;
	}
	
	

}
