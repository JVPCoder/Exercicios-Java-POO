package lista4.ex5;

public class TurmaTeste {

	public static void main(String[] args) {
		Turma turma1 = new Turma("Fundamentos POO");

		turma1.consultarNotas();
		
		turma1.consultarAluno(0);
		turma1.consultarAluno(1);
		turma1.consultarAluno(2);
		turma1.consultarAluno(3);
		turma1.consultarAluno(4);
		
		turma1.fazerMediaTurma();
	}

}
