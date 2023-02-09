import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    
    int h1 = teclado.nextInt();
    int h2 = teclado.nextInt();
    int f1 = teclado.nextInt();
    int f2 = teclado.nextInt();

    if ( h1 > h2 && f1 > f2){
        System.out.println(h1 + f2);
        System.out.println(h2 * f1);
    }

    
    else if ( h1 > h2 && f1 < f2){
        System.out.println(h1 + f1);
        System.out.println(h2 * f2);
    }


    else if ( h1 < h2 && f1 > f2){
        System.out.println(h2 + f2);
        System.out.println(h1 * f1);
    }


    else if ( h1 < h2 && f1 < f2){
        System.out.println(h2 + f1);
        System.out.println(h1 * f2);

    }


        teclado.close();
    }
}
