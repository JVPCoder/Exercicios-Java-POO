package lista7.ex00;

public class IRPF implements Imposto{

	@Override
	public double calcularImposto(double valorOriginal) {
		return valorOriginal + (valorOriginal * 0.075);
	}

}
