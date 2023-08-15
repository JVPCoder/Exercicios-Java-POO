package lista3.ex5;

public class Local {
	private String nomeLocal;
	private int capacidadeMax;
	private Endereco endereco;
	
	public Local(String nomeLocal, int capacidadeMax, Endereco endereco) {
		this.nomeLocal = nomeLocal;
		this.capacidadeMax = capacidadeMax;
		this.endereco = endereco;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	
	
}
