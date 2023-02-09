import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");

        String escolha = teclado.next();

        switch (escolha) {
            case "T":
                System.out.println("digite a base do triãngulo");
                Double base1 = teclado.nextDouble();

                System.out.println("digite a altura do triângulo");
                Double altura1 = teclado.nextDouble();

                System.out.println(base1 * altura1 / 2);
                break;

            case "Q":
                System.out.println("digite o lado do quadrado");
                double lado1 = teclado.nextDouble();

                System.out.println(lado1 * lado1);
                break;

            case "R":
                System.out.println("digite a base do retângulo");
                double base2 = teclado.nextDouble();

                System.out.println("digite a altura do retângulo");
                double altura2 = teclado.nextDouble();

                System.out.println(base2 * altura2);
                break;

            case "C":
                System.out.println("digite o raio");
                Double raio = teclado.nextDouble();

                System.out.print(raio * raio * 3.14);
        }


        teclado.close();
    }
}
