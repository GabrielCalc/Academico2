
public class Turma {
	private String codigo;
	private String professor;
	private String Disciplina;
	
	
	
	public Turma(String codigo, String professor, String disciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		Disciplina = disciplina;
	}
	
		
	@Override
	public String toString() {
		return "Turma [código: " + codigo + ", professor: " + professor + ", Disciplina: " + Disciplina + "]";
	}


	public String getCódigo() {
		return codigo;
	}
	public void setCódigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	
	

}
