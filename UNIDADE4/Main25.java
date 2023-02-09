import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números ");

        int escolha = teclado.nextInt();

        System.out.println("digite um valor");
        System.out.println("digite outro valor");
        
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();


        switch (escolha) {

            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a -b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);

        }


        teclado.close();
    }
}
