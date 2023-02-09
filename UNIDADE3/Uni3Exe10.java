import java.util.Scanner;
import java.lang.Math;

public class Uni3Exe10 { 
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("catetos :");
    double a = teclado.nextDouble();
    double b = teclado.nextDouble();

    teclado.close();

    double hipo = a*a + b*b;

    double comprimento = Math.sqrt(hipo);

    System.out.println(comprimento);





    }
}