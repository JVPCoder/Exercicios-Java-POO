package Lista2;

public class Livro {
	String titulo;
	String autor;
	String editora;
	int paginas;
	int anopublicacao;
	boolean situacao;
	
	public void realizarEmprestimo() {
		if(situacao) {
			System.out.println(titulo + " foi emprestado com sucesso");
			situacao = false;
		}else {
			System.out.println(titulo + " indisponivel, aguarde devolução");
		}
	}
	
	public void realizarDevolucao() {
		if(!situacao) {
			System.out.println(titulo + " foi devolvido com sucesso");
			situacao = true;
		}else {
			System.out.println(titulo + " ja esta no estoque");
		}
	}
	
	public void realizarRelatorio() {
		if(situacao) {
			System.out.println(titulo + ", " + autor + ", " + editora + ", " + paginas + " paginas, " + anopublicacao + ", " + "disponivel para emprestimo");
		}else {
			System.out.println(titulo + ", " + autor + ", " + editora + ", " + paginas + " paginas, " + anopublicacao + ", " + "indisponivel para emprestimo");
		}
	}
}
