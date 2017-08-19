import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disciplina d1 = new Disciplina ("LTP1", "Ciência da computação", 75);
		System.out.println(d1);
		
		Professor p1 = new Professor ("Marcos", "21557847", "Mestre", "2164565165");
		System.out.println(p1);
		
		Turma t1 = new Turma ("UN", p1.getNome(), d1.getNome());
		System.out.println(t1);
		
		//instanciar objetos da classe aluno
		Aluno a1 = new Aluno ("Gabriel Gago", "21708493", "M", LocalDate.of(2000, 4, 9));
		Aluno a2 = new Aluno ("Mary Jane", "216099854", "F", LocalDate.of(1997, 8, 4));
		Aluno a3 = new Aluno ("José Paulo", "21551478", "M", LocalDate.of(1998, 4, 23));
		Aluno a4 = new Aluno ("Livia ", "21506899", "F", LocalDate.of(1994, 2, 15));
		Aluno a5 = new Aluno ("Pedro", "21707541", "M", LocalDate.of(1988, 3, 8));
		Aluno a6 = new Aluno ("Mendes", "21602254", "M", LocalDate.of(1996, 10, 11));
		
		//adicionar a1 em t1
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		t1.adicionarAluno(a6);
		
		//imprimir alunos da turma 1

		System.out.println(t1.listarAlunos());
		Calculadora c1 = new Calculadora();
		
		System.out.println(c1.retMenção(9));
		System.out.println(c1.retResultado(c1.retMenção(2.3)));
	
	
	}
}

