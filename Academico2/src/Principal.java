import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar dataNascimento= Calendar.getInstance();
		dataNascimento.set(Calendar.YEAR, 2000);
		dataNascimento.set(Calendar.MONTH, Calendar.MAY);
		dataNascimento.set(Calendar.DAY_OF_MONTH, 9);
		
		Aluno a1 = new Aluno ("Gabriel Gago", "21708493", "M", dataNascimento);
		System.out.println(a1);
		
		Disciplina d1 = new Disciplina ("LTP1", "Ciência da computação", 75);
		System.out.println(d1);
		
		Professor p1 = new Professor ("Marcos", "21557847", "Mestre", "2164565165");
		System.out.println(p1);
		
		Turma t1 = new Turma ("UN", p1.getNome(), d1.getNome());
		System.out.println(t1);
	}

}
