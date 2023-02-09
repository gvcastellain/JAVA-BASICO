import java.util.Scanner;

public class main19 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int x = teclado.nextInt();
    int y = teclado.nextInt();

    if ( x == 0 && y == 0){
        System.out.print("quadrante 0");
    }

    else if ( x > 0 && y > 0){
        System.out.print("primeiro quadrante");
    }

    else if ( x < 0 && y > 0){
        System.out.print("segundo quadrante");
    }

    else if ( x < 0 && y < 0 ){
        System.out.print("terceiro quadrante");
    }

    else if ( x > 0 && y < 0){
        System.out.print("quarto quadrante");
    }

        teclado.close();
    }
}
