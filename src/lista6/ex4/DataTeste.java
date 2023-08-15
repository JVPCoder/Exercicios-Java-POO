package lista6.ex4;

public class DataTeste {

	public static void main(String[] args) {
		Data data0 = new Data(31,03,2003);
		Data data1 = new Data();
		Data data2 = new Data(10);
		Data data3 = new Data(11, 2003);
		Feriado feriado1 = new Feriado();
		Feriado feriado2 = new Feriado("Dia dos Pais");
		Feriado feriado3 = new Feriado(25,12,2023, "Natal");
		
		System.out.println(data0);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		System.out.println(feriado1);
		System.out.println(feriado2);
		System.out.println(feriado3);
		
	}

}
