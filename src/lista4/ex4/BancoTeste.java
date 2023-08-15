package lista4.ex4;

public class BancoTeste {

	public static void main(String[] args) {
		Titular titular = new Titular("João", "11");
		Titular titular1 = new Titular("Bruna", "22");
		Titular titular2 = new Titular("Ariovaldo", "33");
		Titular titular3 = new Titular("Rosana", "44");
		
		Banco banco = new Banco();

		banco.consultar(1);
		banco.depositar(1, 500.0);
		banco.consultar(2);
		banco.consultar(1);
	}

}
