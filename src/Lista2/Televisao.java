package Lista2;

public class Televisao {
	String marca;
	int polegada;
	String resolucao;
	int volume;
	int canal;
	
	
	public void ligar() {
		
	}
	
	public void desligar() {
		
	}
	
	public void aumentarVolume() {
		if(volume >= 100) {
			System.out.println("Volume Máximo atingido");
		}else {
			volume += 1;
		}
	}
	
	public void diminuirVolume() {
		if(volume <= 0) {
			System.out.println("Volume Minimo atingido");
		}else {
			volume -= 1;
		}
	}
	
	public void aumentarCanal() {
		canal += 1;
	}
	
	public void diminuirCanal() {
		canal -= 1;
	}
	
	public void realizarRelatorio() {
		System.out.println(marca + ", " + polegada + ", " + resolucao + ", " + "canal:" + canal + ", volume:" + volume);
	}
}
