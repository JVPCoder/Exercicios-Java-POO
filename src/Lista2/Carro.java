package Lista2;

public class Carro {

	// atributos da classe
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;

	// m�todos da classe
	public void ligar() {

		if (!ligado) {
			
			ligado = true;
			System.out.println(marca + " " + modelo + " ligou.");
		
		} else {
			
			System.out.println(marca + " " + modelo + " j� encontra-se ligado");
		}
	}

	public void desligar() {

		if (ligado && velocidade == 0) {
		
			ligado = false;
			System.out.println(marca + " " + modelo + " desligou.");
		
		} else {
		
			System.out.println("N�o foi poss�vel desligar o " + marca + " " + modelo);
		}
	}

	public void acelerar() {

		if (ligado) {

			velocidade += 10;

			if (velocidade > 200) {

				System.out.println(marca + " " + modelo + " atingiu a velocidade m�xima.");
				velocidade = 200;
			}

		} else {
			System.out.println(marca + " " + modelo + " n�o encontra-se ligado.");
		}
	}

	public void frear() {

		if (ligado) {

			velocidade -= 10;

			if (velocidade < 0) {

				velocidade = 0;
				System.out.println(marca + " " + modelo + " encontra-se parado.");
			}

		} else {

			System.out.println(marca + " " + modelo + " n�o encontra-se ligado.");
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + ", placa=" + placa + ", cor=" + cor
				+ ", ligado=" + ligado + ", velocidade=" + velocidade + "]";
	}
}
