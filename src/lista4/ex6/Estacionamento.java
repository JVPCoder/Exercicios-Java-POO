package lista4.ex6;
import java.util.Scanner;


public class Estacionamento {
	private Vaga[] vagas;
	
	public Estacionamento() {
		this.vagas = new Vaga[4];
		this.abrirEstacionamento();
	}
	
	private void abrirEstacionamento() {
		for(int i = 0; i < this.vagas.length; i++) {
			Vaga vagas = new Vaga(i);
			this.vagas[i] = vagas;
		}
	}
	
	public void estacionar(int id, int horaEntrada) {
		Scanner scanner = new Scanner(System.in);
		
		if(this.vagas[id].getVeiculo() != null) {
			System.out.println("Vaga ocupada PORRA");
		}else {
			System.out.printf("Digite a placa do veiculo:");
			this.vagas[id].setVeiculo(new Veiculo(scanner.nextLine()));
			
			if(this.vagas[id].getVeiculo() == null) {
				System.out.println("Erro ao estacionar veículo");
			}else {
				this.vagas[id].getVeiculo().setHoraInicial(horaEntrada);
				System.out.println("Veiculo Estacionado");
			}
			
		}
		
	}
		
	public void retirar(int id, int horaSaida) {
		if(this.vagas[id].getVeiculo() == null) {
			System.out.println("Não tem nenhum veículo estacionado aqui");
		}else {
			this.vagas[id].getVeiculo().setHoraFinal(horaSaida);
			
			int entrada = this.vagas[id].getVeiculo().getHoraInicial(); //10
			int saida = this.vagas[id].getVeiculo().getHoraFinal(); //15
			int duracao = saida - entrada; //5
			int duracaoMin = 3;
			double taxa = 2.0;
			
			if(duracao > duracaoMin) {
				int horaExtra = duracao - duracaoMin; //5 - 3 = 2
				taxa += (horaExtra * 0.5); // taxa = 2 + (2 * 0.5) = 2 + 1 = 3
				
				System.out.println("Veículo Retirado, Taxa de : " + taxa);
			}else {
				System.out.println("Veículo Retirado, Taxa de :" + taxa);
			}
			
		}
		
	}
	
	
}
