package Lista1;

public class CarroTeste {
	public static void main(String [] args) {
		
		//instancia de objetos
	Carro carro1 = new Carro();
	Carro carro2 = new Carro();
	Carro carro3 = new Carro();
	
		//atribuir valores direto
	
	carro1.modelo = "Supra";
	carro1.marca = "Toyota";
	carro1.cor = "Laranja";
	carro1.ano = 1993;
	carro1.renavam = 123456;
	carro1.chassi = "BC4679";
	carro1.placa = "BRI-4NW";
	
	carro2.modelo = "Carrera";
	carro2.marca = "Porsche";
	carro2.cor = "Preta";
	carro2.ano = 2022;
	carro2.renavam = 133246;
	carro2.chassi = "R1C023";
	carro2.placa = "MND-N4D";
	
	carro3.modelo = "M4";
	carro3.marca = "BMW";
	carro3.cor = "Azul";
	carro3.ano = 2022;
	carro3.renavam = 98765;
	carro3.chassi = "P01S31";
	carro3.placa = "ABC-123";
	
	// imprimir os valores em console
			System.out.println("ATRIBUTOS DO CARRO 1");
			System.out.println("Modelo: " + carro1.modelo);
			System.out.println("Marca: " + carro1.marca);
			System.out.println("Ano: " + carro1.ano);
			System.out.println("Placa: " + carro1.placa);
			System.out.println("Cor: " + carro1.cor);
			System.out.println("Renavam: " + carro1.renavam);
			System.out.println("Chassi: " + carro1.chassi);
			
			System.out.println("\nATRIBUTOS DO CARRO 2");
			System.out.println("Modelo: " + carro2.modelo);
			System.out.println("Marca: " + carro2.marca);
			System.out.println("Ano: " + carro2.ano);
			System.out.println("Placa: " + carro2.placa);
			System.out.println("Cor: " + carro2.cor);
			System.out.println("Renavam: " + carro2.renavam);
			System.out.println("Chassi: " + carro2.chassi);
			
			System.out.println("\nATRIBUTOS DO CARRO 3");
			System.out.println("Modelo: " + carro3.modelo);
			System.out.println("Marca: " + carro3.marca);
			System.out.println("Ano: " + carro3.ano);
			System.out.println("Placa: " + carro3.placa);
			System.out.println("Cor: " + carro3.cor);
			System.out.println("Renavam: " + carro3.renavam);
			System.out.println("Chassi: " + carro3.chassi);
	
	
	
	}
}