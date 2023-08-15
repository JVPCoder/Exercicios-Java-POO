package lista6.ex2;

public class ImovelNovo extends Imovel {

	protected double adicional;
	
	public ImovelNovo(String endereco, double valorbase, double adicional) {
		super(endereco, valorbase);
		this.adicional = adicional;
	}
	
	public double calcularValor() {
		double novoValor = this.getValorbase() + this.adicional;
		
		return novoValor;
	}
	
	public void imprimirValor() {
		System.out.println("=============================================");
		System.out.println("Valor inicial: " + this.getValorbase());
		System.out.println("Adicional do Imóvel: " + this.adicional);
		System.out.println("Valor do Imovél Novo: " + this.calcularValor());
		System.out.println("=============================================");
	}
	
	
	
}
