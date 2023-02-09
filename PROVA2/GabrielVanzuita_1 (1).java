import java.util.Scanner;

public class GabrielVanzuita_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int votoChapa1 = 0, votoChapa2 = 0;
    int votoNulo = 0;
    int voto;

    do {
      System.out.println("___Eleições Centro Acadêmico___ ");
      System.out.println("1 - Voto em Chapa1");
      System.out.println("2 - Voto em Chapa2");
      System.out.println("3 - voto Nulo");
      System.out.println("0 - Encerrar votação");
      voto = teclado.nextInt();
      switch (voto) {
        case 1:
          votoChapa1++;
          break;
        case 2:
          votoChapa2++;
          break;
        case 3:
          votoNulo++;
          break;
        case 0:
          break;
        default:
          System.out.println("Opção incorreta");
          break;
      }
    } while (voto != 0);

    int votoTotal = votoChapa1 + votoChapa2 + votoNulo;

    System.out.println("Total Chapa 1: " + votoChapa1);
    System.out.println("Total Chapa 2: " + votoChapa2);
    System.out.println("Total Nulo: " + votoNulo);
    System.out.println("Total Geral: " + votoTotal);
teclado.close();
  }
}