package lista4.ex4;

public class Conta {
	private int id;
	private double saldo;
	private Titular titular;

	
	public Conta(int id) {
		this.id = id;
		this.saldo = 0;
		this.titular = titular;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Titular getTitular() {
		return titular;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
}
