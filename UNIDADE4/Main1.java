import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    int horas = teclado.nextInt();
    double porhora = teclado.nextInt();
    double valor = horas * porhora;

    if (horas > 160) {
        double valor1 = (horas - 160) * porhora * 1.5;
        System.out.println(valor + valor1);
    } else {
        System.out.println(valor);
    }
    

    teclado.close();

    }
}
