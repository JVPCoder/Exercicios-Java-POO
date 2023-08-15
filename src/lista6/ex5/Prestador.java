package lista6.ex5;

public class Prestador extends Colaborador{

	protected double valorHora;
	protected String tipoServico;
	
	public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServico) {
		super(nome, endereco, dataInicio);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
	}
	
	@Override
	public void imprimirDados() {
		System.out.println("+============================+");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereco: " + this.getEndereco());
		System.out.println("Data de Contratação: " + this.getDataInicio());
		System.out.println("Valor Pago por Hora:" + this.getValorHora());
		System.out.println("Tipo de Serviço prestado: " + this.getTipoServico());
		System.out.println("+============================+");
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	@Override
	public String toString() {
		return "Prestador [valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome + ", endereco="
				+ endereco + ", dataInicio=" + dataInicio + "]";
	}
	
	
	
}
