package lista3.ex1;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Rua Mundo", 125, "Jd. Terra", "Via Lactea");
		Funcionario funcionario1 = new Funcionario(1411, "João", "14/11/2003", "Masculino", "Desenvolvedor Java", "(13)996538438", endereco1);
		

		funcionario1.emitirRelatorio();
	}

}
