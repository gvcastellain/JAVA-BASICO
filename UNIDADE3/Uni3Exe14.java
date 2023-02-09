import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a distância em kms, e o tempo em horas: ");

        double kms = teclado.nextDouble();
        double tempo = teclado.nextDouble();

        double velomedia = kms/tempo;
        double consumo = kms/12;

        System.out.println("velocidade média: "+velomedia);

        System.out.println("consumo de gasolina: "+consumo);

        teclado.close();
    }
}
