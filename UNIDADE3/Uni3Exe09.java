import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("digite a altura / raio: ");

    double altura = teclado.nextDouble();
    double raio = teclado.nextDouble();

    teclado.close();

    double volume = raio*raio*3.148*altura;

    System.out.println("Volume: "+volume);

    }
}