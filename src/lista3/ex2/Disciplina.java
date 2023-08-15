package lista3.ex2;

public class Disciplina {
	private int codigo;
	private String nome;
	private String modalidade;
	private int cargaHoraria;
	private Professor professor;
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, Professor professor) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}
	
	public void emitirRelatorio(){
		System.out.println("+-------------------------------------------+");
		System.out.println("|Cód: " + this.codigo);
		System.out.println("|Nome: " + this.nome);
		System.out.println("|Modalidade: " + this.modalidade);
		System.out.println("|Carga Horária:" + this.cargaHoraria);
		System.out.println("|Professora GOSTOSA");
		System.out.println("|Registro: " + this.professor.getRegistro());
		System.out.println("|Nome: " + this.professor.getNome());
		System.out.println("|Data de Nascimento: " + this.professor.getDataNascimento());
		System.out.println("|Salario: " + this.professor.getSalario());
		System.out.println("+-------------------------------------------+");
	}
	
}
