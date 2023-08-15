package lista4.ex5;
import java.util.Arrays;
import java.util.Random;


public class Aluno {
	private int ra;
	private String nome;
	private double notas[];
	
	public Aluno(int ra, String nome) {
		this.ra = ra;
		this.nome = nome;
		this.notas = new double[4];
		this.iniciarNotasRandom();
	}
	
	private void iniciarNotasRandom() {
		Random r = new Random();
		
		for(int i = 0; i < this.notas.length; i++) {
			this.notas[i] = r.nextDouble(9) + 1;
		}
	}

	public double fazerMediaAluno() {
		double media = 0;
		
			for(int i = 0; i < this.notas.length; i++) {
				media += this.notas[i]; 
			}
		
		return media /= this.notas.length;
	}
	
	public int getRa() {
		return ra;
	}


	public String getNome() {
		return nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", notas=" + Arrays.toString(notas) + "]";
	}	
	
	
	
}
