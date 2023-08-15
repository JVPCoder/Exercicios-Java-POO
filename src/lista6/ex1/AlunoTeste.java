package lista6.ex1;

public class AlunoTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Zé", "10/05/1999", 365000213, 36320302);
		Aluno aluno1 = new Aluno("Joao", "14/11/2003", 501476477, 365045578, 2376830);
		
		pessoa1.exibirInformacoes();
		
		aluno1.exibirInformacoes();
		
	}

}
