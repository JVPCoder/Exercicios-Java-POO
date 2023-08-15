package lista6.ex3;

public class IngressoNormal extends Ingresso{

	public IngressoNormal(double valor, String tipo) {
		super(valor, tipo);
		
	}
	
	@Override
	public void ImprimirDadosIngresso() {
		super.ImprimirDadosIngresso();
		System.out.println(this.valor);
	}
	
	
}
