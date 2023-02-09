import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.print("Frangos: ");

    int frangos = teclado.nextInt();
    
    teclado.close();

    double total = frangos*11;

    System.out.println("gasto: "+total);



    }
}