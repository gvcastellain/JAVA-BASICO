import java.util.Scanner;

public class Aprova3 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    String tipo = teclado.next().toUpperCase();

    if(tipo.equals("A")){
        System.out.println("Azul");
    }

    else if(tipo.equals("V")){
        System.out.println("Vermelha");
    }

    else if(tipo.equals("P")){
        System.out.println("Preta");
    }

    else{
        System.out.println("Tipo incorreto");
    }

    teclado.close();
    }
}
