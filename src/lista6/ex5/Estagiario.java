package lista6.ex5;

public class Estagiario extends Funcionario{	
	private int ciee;
	
	public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciee) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciee = ciee;
	}
	
	@Override
	public void imprimirDados() {
		System.out.println("+============================+");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereco: " + this.getEndereco());
		System.out.println("Data de Admissão: " + this.getDataInicio());
		System.out.println("Funcao: " + this.getFuncao());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Numero da CT: " + this.getCiee());
		System.out.println("+============================+");
	}

	public int getCiee() {
		return ciee;
	}

	public void setCiee(int ciee) {
		this.ciee = ciee;
	}

	@Override
	public String toString() {
		return "Estagiario [ciee=" + ciee + ", funcao=" + funcao + ", salario=" + salario + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	
	
}
