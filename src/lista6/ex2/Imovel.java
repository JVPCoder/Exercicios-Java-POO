package lista6.ex2;

public class Imovel {
	protected String endereco;
	protected double valorbase;
	
	public Imovel(String endereco, double valorbase) {
		this.endereco = endereco;
		this.valorbase = valorbase;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValorbase() {
		return valorbase;
	}

	public void setValorbase(double valorbase) {
		this.valorbase = valorbase;
	}

	@Override
	public String toString() {
		return "Imovel [endereco=" + endereco + ", valorbase=" + valorbase + "]";
	}
	
	
	
	
}
