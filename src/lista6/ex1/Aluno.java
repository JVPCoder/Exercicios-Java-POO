package lista6.ex1;

public class Aluno extends Pessoa{

	protected int matricula;
	
	
	public Aluno(String nome, String nascimento, long rg, long cpf, int matricula) {
		super(nome, nascimento, rg, cpf);
		this.matricula = matricula;
		
	}
	
	@Override
	public void exibirInformacoes() {
		System.out.println("======================");
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome: " + this.nome);
		System.out.println("Nascimento: " + this.nascimento);
		System.out.println("Rg: " + this.rg);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("======================");
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
}
