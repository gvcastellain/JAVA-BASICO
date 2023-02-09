import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.println("digite as quantidades: 350ml / 600ml / 2L");
    int a350 = teclado.nextInt();
    int b600 = teclado.nextInt();
    int c2000 = teclado.nextInt();

    teclado.close();

    double total = a350*0.35 + b600*0.6 + c2000*2;

    System.out.println("litros: "+total);






    }
}