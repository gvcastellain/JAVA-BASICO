import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
    double a = teclado.nextInt();
    
    teclado.close();

    double desconto = a*0.12;

    double preco = a - desconto;

    System.out.println("O valor do desconto é de R$"+ desconto);

    System.out.println("O preço do par de sapatos com desconto é R$"+preco);
    }
}