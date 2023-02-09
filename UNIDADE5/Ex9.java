import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("informe quantas pessoas: ");
        int n =  teclado.nextInt();
        String adiciona = "", deixaCerto = " ,";

        int a = 0, b = 0;

        for ( int contador = 1; contador <= n; contador++){
            System.out.println("informe o nome: ");
            String nome = teclado.next();
            System.out.println("informe a idade: ");
            int idade  =  teclado.nextInt();

            if (idade == 18){
                adiciona += nome;
                deixaCerto += adiciona;
            }

            if (idade > 20){
                a += (contador / 2);
            }
        }

        System.out.println(deixaCerto);

        teclado.close();
    }
}
