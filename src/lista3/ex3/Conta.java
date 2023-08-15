package lista3.ex3;

public class Conta {
	private int numero;
	private double saldo;
	private Titular titular;
	
	public Conta(int numero, Titular titular) {
		this.numero = numero;
		this.saldo = 0;
		this.titular = titular;
	}
	
	public void sacar(double valor) {
		if(valor > this.saldo) {
			System.out.println("Saque de: " + valor + " inválido");
		}else {
			System.out.println("Saque de: " + valor+ " realizado");
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void emitirSaldo() {
		System.out.println("+----------------------------------+");
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Saldo da Conta: " + this.saldo);
		System.out.println("Cpf: " + this.titular.getCpf());
		System.out.println("RG: " + this.titular.getRg());
		System.out.println("Data de Nascimento: " + this.titular.getDataNascimento());
		System.out.println("Sexo: " + this.titular.getSexo());
		System.out.println("Renda Mensal: " + this.titular.getRendaMensal());
		System.out.println("Endereço: " + this.titular.getEndereco().getLogradouro());
		System.out.println("Numero: " + this.titular.getEndereco().getNumero());
		System.out.println("Bairro: " + this.titular.getEndereco().getBairro());
		System.out.println("Cidade: " + this.titular.getEndereco().getCidade());
		System.out.println("Estado: " + this.titular.getEndereco().getUf());
		System.out.println("+----------------------------------+");
	}
}
