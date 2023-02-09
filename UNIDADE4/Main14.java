import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int dia = teclado.nextInt();
    int mes = teclado.nextInt();
    int ano = teclado.nextInt();
    int bi = ano % 4;

    if ( dia >= 1 && dia <= 31 && 
         mes >= 1 && mes <= 12 &&
         ano > 0 ) {
            if ( mes == 2) {
                if ( bi == 0 && mes == 2 && dia >= 1 && 
                dia <= 29 ) {
                    System.out.print("data válida");
                }
                else if (bi != 0 && mes == 2 && dia >= 1 &&
                 dia <= 28 ) {
                    System.out.print("data válida");
                }
                else {
                    System.out.print("data inválida");
                }

            }
            else if ( mes == 1 || mes == 3 || mes == 5 || 
                 mes == 7 || mes == 8 || mes == 10 || 
                 mes == 12 && dia >= 1 && dia <= 31 ) {
                System.out.print("data válida");
                }

            else if ( mes == 4 || mes == 6 || mes == 9 || 
                 mes == 9 || mes == 11) {
                    if (dia == 31) {
                        System.out.print("data inválida");
                    }
                    else {
                        System.out.print("data válida");
                    }
                 }
                 

                }

                

            

    else {
        System.out.print("data inválida");
    }
    



    teclado.close();

    }
}
