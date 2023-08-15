package lista6.ex3;

public class IngressoVip extends Ingresso{
	
	protected double adicional;
	protected String local;
	
	public IngressoVip(double valor, String tipo, double adicional, String local) {
		super(valor, tipo);
		this.adicional = adicional;
		this.local = local;
	}
	
	private double calcularValorIngressoVip() {
		double valorVip = this.getValor() + this.adicional;
		
		return valorVip;
	}
	
	@Override
	public void ImprimirDadosIngresso() {
		
		System.out.println("+===========================+");
		super.ImprimirDadosIngresso();
		System.out.println(this.local);
		System.out.println(this.calcularValorIngressoVip());
		System.out.println("+===========================+");
	}
	
}
