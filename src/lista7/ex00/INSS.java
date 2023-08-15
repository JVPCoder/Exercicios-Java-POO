package lista7.ex00;

public class INSS implements Imposto{

	@Override
	public double calcularImposto(double valorOriginal) {
		return valorOriginal + (valorOriginal * 0.11);
	}

}
