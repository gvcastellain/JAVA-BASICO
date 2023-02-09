import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.println("a cor é azul?");

    String a = teclado.next();

    switch (a){
        case "true":
        System.out.println("Sim");
        break;

        case "false":
        System.out.println("Não");
        break;
    }
    teclado.close();


    }
}
