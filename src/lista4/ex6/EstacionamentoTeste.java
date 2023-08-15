package lista4.ex6;

public class EstacionamentoTeste {

	public static void main(String[] args) {
		
		Estacionamento estacionamento = new Estacionamento();

		estacionamento.estacionar(1, 10);
		estacionamento.estacionar(1, 12);
		estacionamento.estacionar(2, 10);
		estacionamento.retirar(1, 14);
		estacionamento.retirar(2, 15);
	}

}
