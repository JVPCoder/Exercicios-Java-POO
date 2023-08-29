package lista7.ex00;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
   
        double valorInicial = scanner.nextDouble(); //5000
        
     
        double taxaJuros = scanner.nextDouble(); //0.08
        
        int periodo = scanner.nextInt(); // 5
        
        double valorFinal = valorInicial; //5000
        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        
        for(int i = 0; i < periodo; i++) {
        	valorFinal += valorFinal * taxaJuros;
        }


        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
}