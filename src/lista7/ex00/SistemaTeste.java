package lista7.ex00;

public class SistemaTeste {

	public static void main(String[] args) {
		Sistema imposto1 = new Sistema(50000, new IPVA());
		Sistema imposto2 = new Sistema(1600, new INSS());
		Sistema imposto3 = new Sistema(200, new IOF());
		Sistema imposto4 = new Sistema(1000, new IRPF());

		imposto1.imprimirValor();
		imposto2.imprimirValor();
		imposto3.imprimirValor();
		imposto4.imprimirValor();
		
	}

}
