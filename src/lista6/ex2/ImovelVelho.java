package lista6.ex2;

public class ImovelVelho extends Imovel{

	protected double desconto;
	
	public ImovelVelho(String endereco, double valorbase, double desconto) {
		super(endereco, valorbase);
		this.desconto = desconto;
	}
	
	public double calcularValor() {
		double novoValor = this.getValorbase() - this.desconto;
		
		return novoValor;
	}
	
	public void imprimirValor() {
		System.out.println("=============================================");
		System.out.println("Valor inicial: " + this.getValorbase());
		System.out.println("Desconto do Imóvel: " + this.desconto);
		System.out.println("Valor do Imóvel Velho: " + this.calcularValor());
		System.out.println("=============================================");
	}
	
}
