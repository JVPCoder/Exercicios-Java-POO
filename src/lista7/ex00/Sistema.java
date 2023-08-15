package lista7.ex00;

public class Sistema {
	private double valor;
	private Imposto imposto;
	
	public Sistema(double valor, Imposto imposto) {
		this.valor = valor;
		this.imposto = imposto;
	}
	
	public void imprimirValor() {
		System.out.println("+========================+");
		System.out.println("Valor base: " + this.getValor());
		System.out.println("Valor final: " + this.getImposto().calcularImposto(getValor()));
		System.out.println("+========================+");
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	@Override
	public String toString() {
		return "SistemaImpostos [valor=" + valor + ", imposto=" + imposto + "]";
	}
	
	
}
