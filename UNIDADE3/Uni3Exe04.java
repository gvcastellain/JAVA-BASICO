import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("nota 1: ");
    System.out.println("nota 2: ");
    System.out.println("nota 3: ");


    double nota1 = teclado.nextDouble();
    double nota2 = teclado.nextDouble();
    double nota3 = teclado.nextDouble();

    teclado.close();

    double soma = nota1*5 + nota2*3 + nota3*2;

    double media = soma/10;

    System.out.print(media);



    }
}
