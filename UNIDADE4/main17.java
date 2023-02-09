import java.util.Scanner;

public class main17 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    double rendaanual = teclado.nextDouble();
    double renda = rendaanual / 12;
    int pessoas = teclado.nextInt();

    double conta = (pessoas*0.02) * renda;

    double total = renda - conta;

    double imposto5 = total*0.05;
    double imposto10 = total*0.10;
    double imposto15 = total*.15;

    if ( total <= 2000){
        System.out.print(total);
    }

    else if ( total > 2000 && total <= 5000 ){
        System.out.print(imposto5);
    }

    else if ( total > 5000 && total <= 10000){
        System.out.print(imposto10);
    }

    else if ( total > 10000){
        System.out.print(imposto15);
    }




        teclado.close();
    }
}
