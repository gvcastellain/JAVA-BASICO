import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int f1 = teclado.nextInt();
    int f2 = teclado.nextInt();
    int f3 = teclado.nextInt();

    if (f1 > f3 && f2 > f3) {
        System.out.print("mais novo: Luluzinha ");
    }

    else if (f1 > f2 && f3 > f2) {
        System.out.print("mais novo: Zezinho  ");
    }

    else if (f3 > f1 && f2 > f1) {
        System.out.print("mais novo: Marquinhos");
    }

    teclado.close();







    }
}
