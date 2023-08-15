package lista4.ex2;
import java.util.Scanner;


public class Matriz {
	private double mat[][];
	
	
	public Matriz() {
		this.mat = new double [3][3]; 
	}
	
	public void receberValores() {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite o valor de: ["+i+"] ["+j+"]");
				this.mat[i][j] = scanner.nextDouble();
			}
		}
	}
	
	public void somarElementos() {
		double soma = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				soma += this.mat[i][j] ;
			}
		}
		
		System.out.println("Soma da Matriz é: " + soma);
	}
	
	public void calcularMediaImpares() {
		double media = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(this.mat[i][j] % 2 != 0) {
					media += this.mat[i][j];
				}				
			}
		}
		
		media /= 9;
		
		System.out.println("Media dos impares: " + media);
	}
	
	public void verificarNumerosPares() {
		int contador = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(this.mat[i][j] % 2 == 0) {
					contador++;
				}
			}
		}
		
		System.out.println("Quantidade de pares: " + contador);
		
	}
	
	public void exibirElementos() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Elemento ["+i+"]["+j+"]: " + this.mat[i][j]);
			}
		}
	}
	
}
