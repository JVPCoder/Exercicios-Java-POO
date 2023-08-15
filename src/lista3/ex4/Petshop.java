package lista3.ex4;

public class Petshop {
	public static void main(String[]args) {
		Endereco endereco = new Endereco("Rua Curitiba", 35, "Paraná", "Registro", "SP");
		Dono dono1 = new Dono("445823858-26", "Bruna", "16993734450", "brubs_silva123@gmail.com", endereco);
		Dono dono2 = new Dono("365045578-10", "Joao", "13996538438", "doublecanal@gmail.com", endereco);
		Tratamento tratamento1 = new Tratamento();
		Tratamento tratamento2 = new Tratamento();
		Tratamento tratamento3 = new Tratamento();
		Animal animal1 = new Animal("Mozi", 8, "Menina", dono1);
		Animal animal2 = new Animal("Nina", 4, "Menina", dono2);
		Animal animal3 = new Animal("Zeus", 3, "Menino", dono2);
		
		
		animal1.consultarTratamento();
		animal1.realizarTratamento(tratamento3, "Parar de lamber o pé", "15/05/2023");
		animal1.consultarTratamento();
		animal1.encerrarTratamento("17/05/2023");
		animal1.consultarTratamento();
		
		animal2.realizarTratamento(tratamento1,"Passar remedio no machucado perto do olho", "13/05/2023");
		animal2.consultarTratamento();
		animal2.encerrarTratamento("14/05/2023");
		animal2.consultarTratamento();
		
		animal3.realizarTratamento(tratamento2,"Tirar Bola", "14/05/2023");
		animal3.consultarTratamento();
		animal3.encerrarTratamento("16/05/2023");
		animal3.consultarTratamento();
	}
}
