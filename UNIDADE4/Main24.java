import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int ordem = teclado.nextInt();

    switch (ordem){

        case 1:
            System.out.println("1, 2, 3");
            break;

        case 2:
            System.out.println("3, 2, 1");
            break;

        case 3:
            System.out.println("1, 3, 2");
            break;
    }


    teclado.close();

    }
}
