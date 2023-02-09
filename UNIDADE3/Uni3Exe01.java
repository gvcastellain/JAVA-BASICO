import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    int a = teclado.nextInt();
    int b = teclado.nextInt();

    teclado.close();
    
    int area = a*b;

    System.out.println(area);




    }
}