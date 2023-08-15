package lista6.ex1;

public class Pessoa {
	protected String nome;
	protected String nascimento;
	protected long rg;
	protected long cpf;
	
	public Pessoa(String nome, String nascimento, long rg, long cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public void exibirInformacoes() {
		System.out.println(this.nome);
		System.out.println(this.nascimento);
		System.out.println(this.rg);
		System.out.println(this.cpf);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + ", rg=" + rg + ", cpf=" + cpf + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
	
}
