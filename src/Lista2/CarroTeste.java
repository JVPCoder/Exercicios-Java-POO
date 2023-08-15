package Lista2;

public class CarroTeste {

	public static void main(String[] args) {

		// instancia��o de objetos
		Carro carro1 = new Carro();

		// atribuir valores aos atributos de cada carro
		carro1.modelo = "Gol";
		carro1.marca = "Volkswagen";
		carro1.ano = 2020;
		carro1.placa = "ABC-1234";
		carro1.cor = "Amarelo";

		// testes dos m�todos do carro
		System.out.println(carro1);

		carro1.ligar();
		carro1.acelerar();
		System.out.println(carro1);

		carro1.frear();
		carro1.frear();
		carro1.frear();
		System.out.println(carro1);
	}
}
