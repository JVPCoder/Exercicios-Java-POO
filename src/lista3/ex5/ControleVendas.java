package lista3.ex5;

public class ControleVendas {

	public static void main(String[] args) { 
		
		Endereco endereco = new Endereco("Rua Curitiba", 35, "Paraná", "Registro", "SP");
		Local local = new Local("Sassaki Eventos", 1000, endereco);
		Artista artista = new Artista("Matue", "Brasileiro", "30 PRA UM");
		Evento evento = new Evento("Show FODA", artista, "20/05", local, 18);
		
		evento.consultarIngresso();
		evento.venderIngresso(50);
		evento.consultarIngresso();
		
	}

}
