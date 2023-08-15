package lista6.ex5;

public class RhTeste {

	public static void main(String[] args) {
		Colaborador cola1 = new Colaborador("Robertin", "Rua do Cu", "14/05");
		Funcionario cola2 = new Funcionario("Junin", "Rua do Anal", "20/06", "Penetrar ânus", 2000);
		Empregado cola3 = new Empregado("Kid Bengala", "Rua Vaginilda", "04/01", "Penetrar buracos alheios", 5000, 6969);
		Estagiario cola4 = new Estagiario("Kidzinho", "Rua Mixereca", "05/02", "Penetrar os buracos que o Bengala nao entrou", 1500, 5858);
		Prestador cola5 = new Prestador("Albatroz", "Rua Zimbabue", "06/09", 10, "Entregar Lubrificante");
		Empresa cola6 = new Empresa("Juvenal Corp", "Rua Alberto Fonseca", "03/07", 5, "Entregar Camisinha", 123456);
		Autonomo cola7 = new Autonomo("Mia Khalifa", "Rua Jalim Rabei", "07/03", 100, "Mamar", 3650240);
		
		System.out.println(cola1);
		System.out.println(cola2);
		System.out.println(cola3);
		System.out.println(cola4);
		System.out.println(cola5);
		System.out.println(cola6);
		System.out.println(cola7);
		
		cola1.imprimirDados();
		cola2.imprimirDados();
		cola3.imprimirDados();
		cola4.imprimirDados();
		cola5.imprimirDados();
		cola6.imprimirDados();
		cola7.imprimirDados();
	}
	
}
