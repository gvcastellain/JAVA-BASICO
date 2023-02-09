import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int carta1 = teclado.nextInt();
    int carta2 = teclado.nextInt();
    int carta3 = teclado.nextInt();

    int conta1 = carta1 - 3;
    int conta2 = carta2 - 3;
    int conta3 = carta3 - 3;

    int conta4 = carta1 - 4;
    int conta5 = carta2 - 4;
    int conta6 = carta3 - 4;


    if ( conta1 <= 0 ) { // carta 1
        if ( conta5 > 1 && conta6 > 1 ) {
            System.out.print("truco");
             // truco carta1
        }
        else if (conta1 <= 0 && conta2 <= 0 && conta3 <= 0){
            System.out.print("nove");
        }
        else if (conta2 <= 0 || conta3 <= 0){ //seis carta 1 e 2
                if ( conta5 > 1 || conta6 > 1 ){
                    System.out.print("seis");
                }
        }
        else if (conta1 <= 0 && conta2 <= 0 && conta3 <= 0) {
            System.out.print("nove");
        }
    }


    if ( conta2 <= 0 ) { // carta 2
        if ( conta4 > 1 && conta6 > 1 ) {
            System.out.print("truco");
        }
        else if (conta3 <= 0 && conta1 > 1){
            System.out.print("seis");
        }
    }


    if ( conta3 <= 0) {
            if(conta4 > 1 && conta5 > 1){
                System.out.print("truco");
            }
        }
        

    teclado.close();
    
    }
}
