package lista6.ex3;

public class Ingresso {
	protected double valor;
	protected String tipo;
	
	public Ingresso(double valor, String tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}

	public void ImprimirDadosIngresso() {
		System.out.println("Ingresso Tipo: " + this.tipo);
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + ", tipo=" + tipo + "]";
	}
	
	
}
