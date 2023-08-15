package Lista2;

public class TelevisaoTeste {
	public static void main(String[]args) {
		Televisao tv1 = new Televisao();
		Televisao tv2 = new Televisao();
		
		tv1.marca = "Samsung";
		tv1.polegada = 60;
		tv1.resolucao = "4k";
		tv1.canal = 1;
		tv1.volume = 1;
		
		tv2.marca = "LG";
		tv2.polegada = 48;
		tv2.resolucao = "Full HD";
		tv2.canal = 5;
		tv2.volume = 10;
		
		tv1.realizarRelatorio();
		tv1.aumentarCanal();
		tv1.realizarRelatorio();
		tv1.diminuirCanal();
		tv1.aumentarVolume();
		tv1.realizarRelatorio();
		tv1.diminuirVolume();
		tv1.realizarRelatorio();
		
		System.out.println("");
		
		tv2.realizarRelatorio();
		tv2.aumentarCanal();
		tv2.realizarRelatorio();
		tv2.diminuirCanal();
		tv2.aumentarVolume();
		tv2.realizarRelatorio();
		tv2.diminuirVolume();
		tv2.realizarRelatorio();
	}
}
