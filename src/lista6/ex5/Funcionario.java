package lista6.ex5;

public class Funcionario extends Colaborador{

	protected String funcao;
	protected double salario;
	
	public Funcionario(String nome, String endereco, String dataInicio, String funcao, double salario) {
		super(nome, endereco, dataInicio);
		this.funcao = funcao;
		this.salario = salario;
	}
	
	@Override
	public void imprimirDados() {
			System.out.println("+============================+");
			System.out.println("Nome: " + this.getNome());
			System.out.println("Endereco: " + this.getEndereco());
			System.out.println("Data de Admissão: " + this.getDataInicio());
			System.out.println("Funcao: " + this.getFuncao());
			System.out.println("Salário: " + this.getSalario());
			System.out.println("+============================+");
	}
	
	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [funcao=" + funcao + ", salario=" + salario + ", nome=" + nome + ", endereco=" + endereco
				+ ", dataInicio=" + dataInicio + "]";
	}

	

	
	
}
