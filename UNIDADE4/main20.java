import java.util.Scanner;

public class main20 {
    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner(System.in);

    double n1 = teclado.nextDouble();
    double n2 = teclado.nextDouble();
    double n3 = teclado.nextDouble();
    double n4 = teclado.nextDouble();

    double media = (n1 + (n2 *2)+ (n3*3) + n4)/7;

    
    if ( media >= 6){
        if ( media >= 9 ){
            System.out.println("média: " + media);
            System.out.println("conceito: A");
            System.out.println("aprovado");
        }
        else if ( media >= 7.5 && media <9 ){
            System.out.println("média: " + media);
            System.out.println("conceito: B");
            System.out.println("aprovado");
        }
        else if ( media < 7.5){
            System.out.println("média: " + media);
            System.out.println("conceito: C");
            System.out.println("aprovado");
        }
    
    else if ( media >= 4 && media < 6){
        System.out.println("média: " + media);
            System.out.println("conceito: D");
            System.out.println("reprovado");
    }

    else if ( media < 4 ){
        System.out.println("média: " + media);
            System.out.println("conceito: E");
            System.out.println("reprovado");
    }


    }
    
    teclado.close();

    }
}
