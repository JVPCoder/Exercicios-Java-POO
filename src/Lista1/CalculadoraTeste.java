package Lista1;

public class CalculadoraTeste {
	public static void main(String [] args) {
		Calculadora calculadora1 = new Calculadora();
		
		calculadora1.marca = "HP";
		calculadora1.modelo = "Science";
		calculadora1.memoria = 10;
		calculadora1.tipo = "Cientifica";
		
		// imprimir os valores em console
		System.out.println("ATRIBUTOS DA CALCULADORA 1");
		System.out.println("Marca: " + calculadora1.marca);
		System.out.println("Modelo: " + calculadora1.modelo);
		System.out.println("Tipo: " + calculadora1.tipo);
		System.out.println("Memoria: " + calculadora1.memoria);
	}
}
