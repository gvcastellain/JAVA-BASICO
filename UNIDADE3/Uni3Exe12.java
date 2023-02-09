import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome = teclado.next();
        double horas = teclado.nextDouble();
        int dependentes = teclado.nextInt();

        teclado.close();

        double bruto = dependentes*60 + horas*10;
        double imposto = bruto*0.085 + bruto*0.05;
        double total = bruto - imposto;

        System.out.println(nome);
        
        System.out.println(bruto);

        System.out.println(total);

    }
}
