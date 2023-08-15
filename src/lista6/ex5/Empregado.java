package lista6.ex5;

public class Empregado extends Funcionario{

	private int carteira;
	
	public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario, int carteira) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteira = carteira;
	}
	
	@Override
	public void imprimirDados() {
		System.out.println("+============================+");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereco: " + this.getEndereco());
		System.out.println("Data de Admissão: " + this.getDataInicio());
		System.out.println("Funcao: " + this.getFuncao());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Numero da CT: " + this.getCarteira());
		System.out.println("+============================+");
	}

	public int getCarteira() {
		return carteira;
	}

	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}

	@Override
	public String toString() {
		return "Empregado [carteira=" + carteira + ", funcao=" + funcao + ", salario=" + salario + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	
	
}
