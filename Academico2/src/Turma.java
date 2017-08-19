import java.util.ArrayList;

public class Turma {
	private String codigo;
	private String professor;
	private String Disciplina;
	private ArrayList<Aluno> alunos;
	
	
	public Turma(String codigo, String professor, String disciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		Disciplina = disciplina;
		this.alunos = new ArrayList<Aluno>();
	}
	
		
	@Override
	public String toString() {
		return "Turma [código: " + codigo + ", professor: " + professor + ", Disciplina: " + Disciplina + "]";
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
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
	
	//metodo que adiciona 1 aluno a turma
	public void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		}
	//Retorna o nome de todos os alunos da turma
			public String listarAlunos(){
				String retorno = "";
				for (int i = 0; i < this.alunos.size(); i++) {
					retorno = retorno + "Nome: " + this.alunos.get(i).getNome() + "\n";
				} 
				return retorno;
			}

}
