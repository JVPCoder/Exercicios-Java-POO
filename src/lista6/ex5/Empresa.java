package lista6.ex5;

public class Empresa extends Prestador{

	private long cnpj;
	
	public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServico, long cnpj) {
		super(nome, endereco, dataInicio, valorHora, tipoServico);
		this.cnpj = cnpj;
	}
	
	@Override
	public void imprimirDados() {
		System.out.println("+============================+");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereco: " + this.getEndereco());
		System.out.println("Data de Contraração: " + this.getDataInicio());
		System.out.println("Valor Pago por Hora:" + this.getValorHora());
		System.out.println("Tipo de Serviço prestado: " + this.getTipoServico());
		System.out.println("Cnpj da Empresa:" + this.getCnpj());
		System.out.println("+============================+");
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	
	
}
