import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int n = 20; 
    double alturas = 0, valores = 0;

    for (int contador = 1; contador <= n; contador++){
        System.out.println("Informe as alturas: " + contador);
        valores = teclado.nextDouble();
        alturas+= valores;
    }
    System.out.println(alturas / 20);


    teclado.close();
    }
}
