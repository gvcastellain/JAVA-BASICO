import java.util.Scanner;


public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();

        int op1 = a/100;
        int op11 = a%100;

        int op2 = op11/10;
        int op22 = a%10;

        int op3 = op22/1;


        System.out.println("centenas: "+op1);
        System.out.println("dezenas: "+op2);
        System.out.println("unidades: "+op3);

        teclado.close();

    }
}
