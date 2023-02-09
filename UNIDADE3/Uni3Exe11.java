import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    double celsius = teclado.nextDouble();

    teclado.close();

    double fahr = 1.8*celsius + 32;

    System.out.println("fahrenheit: "+ fahr);


    }
}
