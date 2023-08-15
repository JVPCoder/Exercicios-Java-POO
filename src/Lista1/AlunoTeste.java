package Lista1;

public class AlunoTeste {
	public static void main(String [] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.ra = "a2376830";
		aluno1.nome = "Joao";
		aluno1.curso = "ADS";
		aluno1.turno = "Noite";
		aluno1.periodo = 2;
		aluno1.coeficiente = 0.7;
		aluno1.situacao = "Boa";
		
		// imprimir os valores em console
		System.out.println("ATRIBUTOS DO ALUNO 1");
		System.out.println("RA: " + aluno1.ra);
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Curso: " + aluno1.curso);
		System.out.println("Turno: " + aluno1.turno);
		System.out.println("Periodo: " + aluno1.periodo);
		System.out.println("Coeficiente: " + aluno1.coeficiente);
		System.out.println("Situacao: " + aluno1.situacao);
	}
}
