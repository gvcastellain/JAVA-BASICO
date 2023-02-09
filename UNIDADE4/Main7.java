import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int peso = teclado.nextInt();
    

    if (peso > 50 ){
        int ajustado = ((peso - 50) / 20) + 1;
        double valor = ajustado * 0.45;
        double total = valor + 0.45;
        System.out.print("custo do selo: " + total);
    }

    else {
        System.out.print("custo do selo: " + 0.45);
    }

    teclado.close();

    }
}
