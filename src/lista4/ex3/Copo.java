package lista4.ex3;

import java.util.Random;

public class Copo {
	Random random = new Random();
	
	private int id;
	private String cor;
	private String material;
	private int capacidadeMax;
	private int capacidadeAtual;
	
	public Copo(int id) {
		this.id = id;
		this.capacidadeMax = 300;
		this.cor = "Transparente";
		this.material = "Plástico";
		this.capacidadeAtual = gerarRandom();
	}

	private int gerarRandom() {
		Random r = new Random();
		return r.nextInt(this.capacidadeMax + 1);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}

	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}

	@Override
	public String toString() {
		return "Copo [random=" + random + ", id=" + id + ", cor=" + cor + ", material=" + material + ", capacidadeMax="
				+ capacidadeMax + ", capacidadeAtual=" + capacidadeAtual + "]";
	}
	
	
	
}
