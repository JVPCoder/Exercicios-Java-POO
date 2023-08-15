package lista4.ex5;
import java.util.Scanner;

public class Turma {
	private String nome;
	private Aluno[] alunos;
	
	public Turma(String nome) {
		this.nome = nome;
		this.alunos = new Aluno[5];
		this.criarTurma();
	}
	
	private void criarTurma() {
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < this.alunos.length; i++) {
			System.out.println("Aluno["+i+"]" + " Nome: ");
			Aluno aluno = new Aluno(i, scanner.nextLine());
			alunos[i] = aluno;
		}
		scanner.close();
	}

	public void consultarNotas() {
		for(int i = 0; i < this.alunos.length; i++) {
			System.out.println(this.alunos[i]);
		}
	}
	
	public void consultarAluno(int ra) {
		double media = this.alunos[ra].fazerMediaAluno();
		
		if(media >= 6.0) {
			System.out.printf("Media do aluno: %.2f Aprovado %n", media);
		}else {
			System.out.printf("Media: %.2f Reprovado %n", media);
		}
		
	}
	
	public void fazerMediaTurma() {
		double mediaTurma = 0;
		
		for(int i = 0; i < this.alunos.length; i++) {
			mediaTurma += this.alunos[i].fazerMediaAluno();
		}
		
		mediaTurma /= this.alunos.length;
		
		System.out.println("Media da turma de " + this.nome);
		System.out.printf("Nota: %.2f", mediaTurma);
	}
	
	public String getNome() {
		return nome;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}
	
}
