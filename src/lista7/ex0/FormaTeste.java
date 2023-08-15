package lista7.ex0;

public class FormaTeste {

	public static void main(String[] args) {
		Forma quadrado = new Quadrado("Verde", 5);
		Forma circulo = new Círculo("Vermelho", 3);
		Forma retangulo = new Retângulo("Azul", 10, 5);
		
		quadrado.imprimirDados();
		circulo.imprimirDados();
		retangulo.imprimirDados();
		
	}

}
