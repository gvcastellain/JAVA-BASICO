import java.util.Scanner;

public class main15 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int data = teclado.nextInt();


        if (data <= 12){
            System.out.print("reajuste de 5%");
        }

        else{
            System.out.print("reajuste de 7%");
        }





        teclado.close();
    }
}
