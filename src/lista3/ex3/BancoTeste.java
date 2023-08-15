package lista3.ex3;

public class BancoTeste {

	public static void main(String[] args) {

		Endereco endereco = new Endereco("Rua Curitiba", 35, "Paraná", "Registro", "SP");
		Titular titular = new Titular("365045578-10", "50147647-7", "João Vitor", "14/11/2003", "Masculino", 5000, endereco);
		Conta conta = new Conta(1411, titular);
		
		conta.emitirSaldo();
		conta.depositar(500);
		conta.depositar(100);
		conta.emitirSaldo();
		conta.sacar(1000);
		conta.sacar(500);
		conta.emitirSaldo();
		
	}

}
