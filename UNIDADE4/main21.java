import java.util.Scanner;

public class main21 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.println("digite kg / altura");

    double kg = teclado.nextDouble();
    double altura = teclado.nextDouble();


    double imc = kg / altura * altura;

    if ( imc < 18.5	){
        System.out.println("Magreza");
    }


    else if ( imc > 18.5 && imc < 25){
        System.out.println("Saudável");
    }

    else if ( imc >= 25 && imc < 30 ){
        System.out.println("Sobrepeso");
    }

    else if ( imc >= 30 && imc < 35){
        System.out.println("Obesidade Grau I");
    }

    else if ( imc >= 35 && imc < 40){
        System.out.println("Obesidade Grau II (severa");
    }

    else if ( imc >= 40){
        System.out.println("Obesidade Grau III (mórbida)");
    }

    teclado.close();

    }
}
