package lista3.ex1;

public class Funcionario {
	private int registro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private String telefone;
	private Endereco endereco;
	
	public Funcionario(int registro, String nome, String dataNascimento, String sexo, String setor, String telefone, Endereco endereco) {
		this.registro = registro;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public void emitirRelatorio() {
		System.out.println("+---------------+");
		System.out.println("|Registro: " + this.registro);
		System.out.println("|Nome: " + this.nome);
		System.out.println("|Data de Nascimento: " + this.dataNascimento);
		System.out.println("|Sexo: " + this.sexo);
		System.out.println("|Setor: " + this.setor);
		System.out.println("|Telefone: " + this.telefone);
		System.out.println("|Endereco");
		System.out.println("|Rua:" + this.endereco.getLogradouro());
		System.out.println("|Numero:" + this.endereco.getNumero());
		System.out.println("|Bairro:" + this.endereco.getBairro());
		System.out.println("|Cidade:" + this.endereco.getCidade());
		System.out.println("|UF:" + this.endereco.getUf());
		System.out.println("+---------------+");
		
	}
}
