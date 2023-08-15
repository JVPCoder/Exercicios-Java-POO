package Lista2;

public class PessoaTeste {
	public static void main(String [] args) {
		//instancia de objeto
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		//atribuicao de valor direto
		pessoa1.nome = "Joao";
		pessoa1.sexo = "Masculino";
		pessoa1.cpf = 1234567890;
		pessoa1.idade = 19;
		pessoa1.altura = 1.69;
		pessoa1.peso = 64.5;
		
		pessoa2.nome = "Ari";
		pessoa2.sexo = "Masculino";
		pessoa2.cpf = 1237894560;
		pessoa2.idade = 65;
		pessoa2.altura = 1.65;
		pessoa2.peso = 81.5;
		
		pessoa3.nome = "Bruna";
		pessoa3.sexo = "Feminino";
		pessoa3.cpf = 321654987;
		pessoa3.idade = 20;
		pessoa3.altura = 1.67;
		pessoa3.peso = 55.0;
		
		// imprimir os valores em console
		/*
					System.out.println("ATRIBUTOS DA PESSOA 1");
					System.out.println("Nome: " + pessoa1.nome);
					System.out.println("Sexo: " + pessoa1.sexo);
					System.out.println("CPF: " + pessoa1.cpf);
					System.out.println("Idade: " + pessoa1.idade);
					System.out.println("Altura: " + pessoa1.altura);
					System.out.println("Peso: " + pessoa1.peso);
					
					System.out.println("\nATRIBUTOS DA PESSOA 2");
					System.out.println("Nome: " + pessoa2.nome);
					System.out.println("Sexo: " + pessoa2.sexo);
					System.out.println("CPF: " + pessoa2.cpf);
					System.out.println("Idade: " + pessoa2.idade);
					System.out.println("Altura: " + pessoa2.altura);
					System.out.println("Peso: " + pessoa2.peso);
					
					System.out.println("\nATRIBUTOS DA PESSOA 3");
					System.out.println("Nome: " + pessoa3.nome);
					System.out.println("Sexo: " + pessoa3.sexo);
					System.out.println("CPF: " + pessoa3.cpf);
					System.out.println("Idade: " + pessoa3.idade);
					System.out.println("Altura: " + pessoa3.altura);
					System.out.println("Peso: " + pessoa3.peso);
		*/
		
		pessoa1.andar();
		pessoa3.dormir();
		pessoa2.falar();
		
	}
}
