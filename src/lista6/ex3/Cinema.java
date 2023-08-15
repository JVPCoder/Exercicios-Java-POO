package lista6.ex3;

public class Cinema {

	public static void main(String[] args) {
		IngressoNormal ingresso1 = new IngressoNormal(15, "Normal");
		CamaroteInferior ingresso2 = new CamaroteInferior(15, "Vip CI", 15, "Camarote Inferior");
		CamaroteSuperior ingresso3 = new CamaroteSuperior(15, "Vip CS", 25, "Camarote Superior");
		
		ingresso1.ImprimirDadosIngresso();
		ingresso2.ImprimirDadosIngresso();
		ingresso3.ImprimirDadosIngresso();
		
	}

}
