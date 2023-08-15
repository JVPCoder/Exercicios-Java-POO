package lista7.ex0;

public abstract class Forma {
	protected String cor;
	protected double area;
	protected double perimetro;
	
	public Forma(String cor) {
		this.cor = cor;
		this.area = 0;
		this.perimetro = 0;
	}
		
	protected abstract double calcularArea();
	protected abstract double calcularPerimetro();
	protected abstract void imprimirDados();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "Forma [cor=" + cor + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
	
	
}
