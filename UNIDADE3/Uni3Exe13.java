import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int h = teclado.nextInt();
        int c = teclado.nextInt();

        double operacao = c*h*9*12.50;

        System.out.print(operacao);

        teclado.close();
    }
    
}
