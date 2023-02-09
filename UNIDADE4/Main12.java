import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int a = teclado.nextInt();
    int b = teclado.nextInt();
    int c = teclado.nextInt();
    int conta1 = a + b;
    int conta2 = a + c;
    int conta3 = b + c;

    if (a < conta3 && b < conta2 && c < conta1) {
        if ( a == b && b == c)  {
            System.out.print("equilátero");
        }

        else if ( a== b || b == c || a == c ) {
            System.out.print("isóceles");
        } 
        else {
            System.out.print("escaleno");
        }
    } 

    else { 
        System.out.print("não é um triângulo");
    }

    teclado.close();


    }
}
