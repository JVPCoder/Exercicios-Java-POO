package Lista2;

public class Notebook {
	String marca;
	String modelo;
	double polegadatela;
	String tipoprocessador;
	int ram;
	int armazenamento;
	
	public void ligar() {
		System.out.println(marca + " " + modelo + " esta ligando");
	}
	public void desligar() {
		System.out.println(marca + " " + modelo + " esta desligando");
	}
	public void processarInfo() {
		System.out.println(marca + " " + modelo + " esta processando informações");
	}
	public void conectarInternet() {
		System.out.println(marca + " " + modelo + " esta conectando a internet");
	}
}
