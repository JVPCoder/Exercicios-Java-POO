package lista7.ex0;

public class Quadrado extends Forma{

	private double lado;
	
	public Quadrado(String cor, double lado) {
		super(cor);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double area = this.lado * this.lado;
		
		return area;
	}
	
	@Override
	public double calcularPerimetro() {
		double per = this.lado * 4;
		
		return per;
	}
	
	@Override
	public void imprimirDados() {
		System.out.println("+=================+");
		System.out.println("Quadrado");
		System.out.println("Cor: " + this.getCor());
		System.out.println("Lado: " + this.getLado());
		System.out.println("Perímetro: " + this.calcularPerimetro());
		System.out.println("Área: " + this.calcularArea());
		System.out.println("+=================+");
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", cor=" + cor + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
	
	
	
}
