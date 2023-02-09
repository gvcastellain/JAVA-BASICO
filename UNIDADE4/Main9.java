import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int amaior = a % b;
        int bmaior = b % a;

        if ( amaior == 0 || bmaior == 0) {
            System.out.print("múltiplo");
        }
        else {
            System.out.print("não é");
        }
            
        teclado.close();

        }

    }

