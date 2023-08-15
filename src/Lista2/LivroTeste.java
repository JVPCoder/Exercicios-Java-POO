package Lista2;

public class LivroTeste {
	public static void main(String [] args) {
		
	Livro livro1 = new Livro();
	Livro livro2 = new Livro();
	
	livro1.titulo = "Trono de Vidro Vol.1";
	livro1.autor = "Sarah J. Mass";
	livro1.editora = "Editora Galera";
	livro1.paginas = 390;
	livro1.anopublicacao = 2013;
	livro1.situacao = true;
	
	livro2.titulo = "Blue Lock Vol.1";
	livro2.autor = "Muneyuki Kanesgiro/Yusuke Nomura";
	livro2.editora = "Planet Manga";
	livro2.paginas = 208;
	livro2.anopublicacao = 2022;
	livro2.situacao = true;
	
	
	livro1.realizarRelatorio();
	livro1.realizarDevolucao();
	livro1.realizarEmprestimo();
	livro1.realizarRelatorio();
	livro1.realizarEmprestimo();
	livro1.realizarDevolucao();

	System.out.println("");
	
	livro2.realizarRelatorio();
	livro2.realizarDevolucao();
	livro2.realizarEmprestimo();
	livro2.realizarRelatorio();
	livro2.realizarEmprestimo();
	livro2.realizarDevolucao();
	}
}
