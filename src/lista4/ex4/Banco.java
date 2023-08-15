package lista4.ex4;


public class Banco {
	private Conta [] contas;
	
	public Banco() {
		this.contas = new Conta[4];
		this.inicializarBanco();
	}
	
	private void inicializarBanco() {
		for (int i = 0; i < this.contas.length; i++) {

			Conta contas = new Conta(i);
			this.contas[i] = contas;
		}
	}
	
	
	public void sacar(int id, double valor) {
		if(valor > this.contas[id].getSaldo()) {
			System.out.println("Saldo inválido");
		}else {
			this.contas[id].setSaldo(this.contas[id].getSaldo() - valor);
			System.out.println("Saque de: R$ " + valor + " concluído");
		}
	}
	
	public void depositar(int id, double valor){
		contas[id].setSaldo(valor + contas[id].getSaldo());
		System.out.println("Deposito de: R$ " + valor + " realizado");
	}
	
	public void consultar(int id) {
		System.out.println("Saldo de: R$" + this.contas[id].getSaldo());
	}
}

