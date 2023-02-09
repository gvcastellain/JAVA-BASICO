import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);


    double a = teclado.nextDouble();

    double conta = a - (int) a;

    if (conta > 0 ){
        System.out.println("tem casas decimais");
    }

    else {
        System.out.println("sem casas decimais");
    }

    teclado.close();


    }
}
