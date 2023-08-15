package lista3.ex4;

public class Animal {
	private String nome;
	private int idade;
	private String sexo;
	private Dono dono;
	private Tratamento tratamento;
	
	public Animal(String nome, int idade, String sexo, Dono dono) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
	}
	
 public void realizarTratamento(Tratamento tratamento,String descricao, String dataInicio) {
	 this.tratamento = tratamento;
	 this.tratamento.setDescricao(descricao);
	 this.tratamento.setDataDeInicio(dataInicio);
	 this.tratamento.setDataDeFim("Indefinido");
	 
	 System.out.println("Tratamento criado, vai dar tudo certo " + this.nome + " !!!");
 }
 public void encerrarTratamento(String dataFim) {
	 this.tratamento.setDataDeFim(dataFim);
	 
	 System.out.println("Tratamento concluído deu tudo certo viu " + this.nome + " :)");
 }
 
 public void consultarTratamento() {
	 if(this.tratamento == null) {
		 System.out.println("Não há tratamento pendente pra você " + this.nome);
	 }else {
		 System.out.println("+-------------------+");
		 System.out.println("Nome: " + this.nome);
		 System.out.println("Descrição tratamento: " + this.tratamento.getDescricao());
		 System.out.println("Data do Inicio: " + this.tratamento.getDataDeInicio());
		 System.out.println("Data de Fim: " + this.tratamento.getDataDeFim());
		 System.out.println("+-------------------+");
	 }
 }
}
