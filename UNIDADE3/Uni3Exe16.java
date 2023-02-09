import java.util.Scanner;


public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();

        int op1 = a/100;
        int op11 = a%100;

        int op2 = op11/10;
        int op22 = a%10;

        int op3 = op22/1;


        System.out.println("notas de 100: "+op1);
        System.out.println("notas de 10: "+op2);
        System.out.println("notas de 1: "+op3);

        teclado.close();

    }
}
