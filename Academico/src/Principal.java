
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno("Gabriel", "123345678", 17, "Computação", "Noturno", "M");
		
	
		System.out.println(a1.imprimirAluno());
		
		Disciplina d1 = new Disciplina("LTP1", "Computação", 75);
		
		System.out.println(d1);
	}

}
