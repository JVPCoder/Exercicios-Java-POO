package lista7.ex0;

public class Círculo extends Forma{

	private double raio;
	
	public Círculo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area = Math.PI + Math.pow(this.raio, 2);
		return area;
	}

	@Override
	public double calcularPerimetro() {
		double per = 2 * Math.PI * this.raio;
		return per;
	}

	@Override
	public void imprimirDados() {
		System.out.println("+=================+");
		System.out.println("Círculo");
		System.out.println("Cor: " + this.getCor());
		System.out.println("Lado: " + this.getRaio());
		System.out.println("Perímetro: " + this.calcularPerimetro());
		System.out.println("Área: " + this.calcularArea());
		System.out.println("+=================+");
	
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Círculo [raio=" + raio + ", cor=" + cor + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
	
	
	
}
