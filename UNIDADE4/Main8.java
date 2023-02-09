import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        

    Scanner teclado = new Scanner(System.in); 

    String letra = teclado.next();

    switch (letra) {

        case "a" :
        case "e" :
        case "i" :
        case "o" :
        case "u" :
            System.out.print("vogal");
            break;

        default:
            System.out.print("não é vogal");
            break;
    }

    teclado.close();

    }
}
