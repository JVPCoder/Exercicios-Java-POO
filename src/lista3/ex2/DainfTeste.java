package lista3.ex2;

public class DainfTeste {
	public static void main(String[]args) {
		Professor professor = new Professor(3103, "Bruna", "31/03/2002", 4000);
		Disciplina disciplina = new Disciplina(6969, "Sexo Intensivo", "Presencial", 45, professor);
		
		disciplina.emitirRelatorio();
	}
}
