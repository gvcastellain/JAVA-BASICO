import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        double chegadaHoras = teclado.nextDouble();
        double chegadaMinutos = teclado.nextDouble();

        double partidaHoras = teclado.nextDouble();
        double partidaMinutos = teclado.nextDouble();

        double total = (partidaHoras + partidaMinutos) - (chegadaHoras + chegadaMinutos);

        if ( total >= 0 && total <= 1.29 ) {
            System.out.println("5 reais");
        }
            
        
        else if ( total >= 1.30 && total <= 2.29 ){
            System.out.println("10 reais");
        }

        else if ( total >= 2.30 && total <= 3.29 ) {
            System.out.println("22.50 ");
        }

        else if ( total >= 3.30 && total  <= 4.29) {
            System.out.println("30 reais");
        }

        else if ( total >= 4.30 ) {
            int resultado = (int) total;
            int conta = resultado * 10;
            System.out.println(conta);
        }



        teclado.close();
    }
}
