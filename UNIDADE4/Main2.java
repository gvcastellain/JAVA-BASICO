import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        

    Scanner teclado = new Scanner(System.in);

    int a = teclado.nextInt();

    if (a % 2 == 0) {
        System.out.print("par");
    }

    else {
        System.out.print("ímpar");
    }
    
    teclado.close();


    }
}
