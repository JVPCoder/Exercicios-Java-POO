package lista7.ex0;

public class Retângulo extends Forma{
	
	private double altura;
	private double base;
	

	public Retângulo(String cor, double altura, double base) {
		super(cor);
		this.altura = altura;
		this.base = base;
	}
	
	
	@Override
	protected double calcularArea() {
		double area = this.base * this.altura;
		
		return area;
	}
	@Override
	protected double calcularPerimetro() {
		double per = (this.base * 2) + (this.altura * 2);
		return per;
	}
	@Override
	protected void imprimirDados() {
		System.out.println("+=================+");
		System.out.println("Quadrado");
		System.out.println("Cor: " + this.getCor());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Base: " + this.getBase());
		System.out.println("Perímetro: " + this.calcularPerimetro());
		System.out.println("Área: " + this.calcularArea());
		System.out.println("+=================+");
		
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	@Override
	public String toString() {
		return "Retângulo [altura=" + altura + ", base=" + base + ", cor=" + cor + ", area=" + area + ", perimetro="
				+ perimetro + "]";
	}
	
	
	
}
