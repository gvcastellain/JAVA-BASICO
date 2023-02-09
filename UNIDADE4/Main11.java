import java.util.Scanner;


public class Main11 {
    public static void main(String[] args) {
        

    Scanner teclado = new Scanner(System.in);

    int data1 = teclado.nextInt();
    int data2 = teclado.nextInt();
    int data3 = teclado.nextInt();

    if ( data1 == data2 && data1 == data3 ){
        System.out.print("trigemeos");
    }

    else if ( data1 == data2 || data2 == data3 || 
    data1 == data3) {
        System.out.print("gemeos");
    }

    else {
        System.out.print("irmãos");

    }


        teclado.close();

    }
}
