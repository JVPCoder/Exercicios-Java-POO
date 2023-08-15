package lista4.ex3;


public class Boteco {

	private Copo[] engradado;

	public Boteco() {

		this.engradado = new Copo[24];
		this.instanciarCopos();
	}

	private void instanciarCopos() {

		for (int i = 0; i < this.engradado.length; i++) {

			Copo copo = new Copo(i);
			this.engradado[i] = copo;
		}
	}

	public void imprimirSituacaoCopos() {

		for (int i = 0; i < this.engradado.length; i++) {

			System.out.println(this.engradado[i]);
		}
	}
}