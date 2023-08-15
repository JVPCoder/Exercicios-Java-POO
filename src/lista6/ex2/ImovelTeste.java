package lista6.ex2;

public class ImovelTeste {

	public static void main(String[] args) {

		ImovelVelho imovel1 = new ImovelVelho("Rua das Flores,189", 180000, 50000);
		
		ImovelNovo imovel2 = new ImovelNovo("Rua Jucelino Kubischeck", 250000, 100000);
		
		imovel1.imprimirValor();
		imovel2.imprimirValor();
		
	}

}
