
public class Disciplina {
	//Atributos
	
	private String nome;
	private String curso;
	private int cargaHorária;
	
	
	
	public Disciplina(String nome, String curso, int cargaHorária) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.cargaHorária = cargaHorária;
		
		
		
	}
	@Override
	public String toString() {
		return "Disciplina [nome: " + nome + ", curso: " + curso + ", cargaHorária: " + cargaHorária + "]";
	}
	
	//Métodos get e set
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
	public int getCargaHorária() {
		return cargaHorária;
	}
	public void setCargaHorária(int cargaHorária) {
		this.cargaHorária = cargaHorária;
	}
	
	

}
