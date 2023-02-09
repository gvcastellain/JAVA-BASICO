import java.util.Scanner;


public class Main6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


        String letra = teclado.next();

        switch (letra) {
        
            case "M":
                System.out.print("masculino");
                break;

            case "F":
                System.out.print("feminino");
                break;

            case "I":
                System.out.print("não informado");
                break;

            default:
                System.out.print("entrada incorreta");
                break;



        }

        teclado.close();

    }
}
