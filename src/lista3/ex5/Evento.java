package lista3.ex5;

public class Evento {
	private String nomeEvento;
	private Artista artista;
	private String data;
	private Local local;
	private int faixaEtaria;
	private int ingressos;
	
	public Evento(String nomeEvento, Artista artista, String data, Local local, int faixaEtaria) {
		this.nomeEvento = nomeEvento;
		this.artista = artista;
		this.data = data;
		this.local = local;
		this.faixaEtaria = faixaEtaria;
		this.ingressos = this.local.getCapacidadeMax();
	}
	
	public void venderIngresso(int numeroIngressos) {
		if(this.ingressos <= 0) {
			System.out.println("Não há mais ingresso a venda");
		}else {
			this.ingressos -= numeroIngressos;
			System.out.println("Ingresso vendido");
		}	
	}
	
	public void consultarIngresso() {
		System.out.println(this.ingressos + " Ingressos disponiveis");
	}
}
