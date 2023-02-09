import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        

    Scanner teclado = new Scanner(System.in);

    int a = teclado.nextInt();
    int b = teclado.nextInt();

    if (a > b){
        System.out.print("a é maior");
    }

    else {
        System.out.print("b é maior");
    }


    teclado.close();

    }
}
