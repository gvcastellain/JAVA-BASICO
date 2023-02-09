import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    System.out.println("valor em kgs: ");
    double kg = teclado.nextDouble();

    teclado.close();

    double preco = 25*kg;

    System.out.println("a pagar: "+preco);



    }
}