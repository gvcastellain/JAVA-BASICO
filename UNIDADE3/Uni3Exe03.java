import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("preço do litro: ");
    System.out.println("dinheiro disponível: ");

    double litro = teclado.nextDouble();
    double dinheiro = teclado.nextDouble();

    teclado.close();

    double total = dinheiro / litro;

    System.out.println("litros = " + total);



    }
}