package Lista2;

public class NotebookTeste {
	public static void main(String [] args) {
		Notebook notebook1 = new Notebook();
		Notebook notebook2 = new Notebook();
		
		//atribuicao direta
		notebook1.marca = "Acer";
		notebook1.modelo = "Nitro 5";
		notebook1.polegadatela = 27.5;
		notebook1.armazenamento = 500;
		notebook1.ram = 16;
		
		notebook2.marca = "Positivo";
		notebook2.modelo = "Podre";
		notebook2.polegadatela = 23;
		notebook2.armazenamento = 250;
		notebook2.ram = 8;
		
		
		// imprimir os valores em console
/*
					System.out.println("ATRIBUTOS DO NOTEBOOK 1");
					System.out.println("Marca: " + notebook1.marca);
					System.out.println("Modelo: " + notebook1.modelo);
					System.out.println("Polegada da tela: " + notebook1.polegadatela);
					System.out.println("SSD: " + notebook1.armazenamento);
					System.out.println("RAM: " + notebook1.ram);
					
					System.out.println("\nATRIBUTOS DO NOTEBOOK 2");
					System.out.println("Marca: " + notebook2.marca);
					System.out.println("Modelo: " + notebook2.modelo);
					System.out.println("Polegada da tela: " + notebook2.polegadatela);
					System.out.println("SSD: " + notebook2.armazenamento);
					System.out.println("RAM: " + notebook2.ram);
*/
		
		notebook1.ligar();
		notebook1.conectarInternet();
		notebook1.processarInfo();
		notebook1.desligar();

		System.out.println(" ");

		notebook2.ligar();
		notebook2.conectarInternet();
		notebook2.processarInfo();
		notebook2.desligar();
		
	}
}
