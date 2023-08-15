package lista7.ex00;

public class IPVA implements Imposto{

	@Override
	public double calcularImposto(double valorOriginal) {
		return valorOriginal + (valorOriginal * 0.03);
	}
	
}
