package lista6.ex5;

public class Autonomo extends Prestador{
	
	private long cpf;
	
	public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cpf = cpf;
	}

	@Override
	public void imprimirDados() {
		System.out.println("+============================+");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereco: " + this.getEndereco());
		System.out.println("Data de Contratação: " + this.getDataInicio());
		System.out.println("Valor Pago por Hora:" + this.getValorHora());
		System.out.println("Tipo de Serviço prestado: " + this.getTipoServico());
		System.out.println("Cpf do Autonomo:" + this.getCpf());
		System.out.println("+============================+");
	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCnpj(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	
	
}
