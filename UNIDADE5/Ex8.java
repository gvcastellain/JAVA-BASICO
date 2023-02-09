import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int n = teclado.nextInt();
    int menor = 0, positivos = 0, base = 0, quantos = 0, media = 0;
    
    for ( int contador = 1; contador <= n; contador++){
        base = teclado.nextInt();

        if ( base < 0) {
            menor = base;
            if ( menor < base){
            }
        }

        else {
            quantos+= contador;
            media = quantos - 1;
            positivos+= base;
        }
    }
    System.out.println(menor);
    System.out.println(positivos / media);
    teclado.close();

    }
}
