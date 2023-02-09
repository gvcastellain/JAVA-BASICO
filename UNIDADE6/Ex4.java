import java.util.Scanner;

public class Ex4 {

    private Ex4() {

        Scanner teclado = new Scanner(System.in);


        int primeiroVetor[] = new int[10];
        int segundoVetor[] = new int[10];
        int somaVetores[] = new int[10];

        lerValores(teclado, primeiroVetor, segundoVetor);
        calcular(primeiroVetor, segundoVetor, somaVetores);
        imprimirVetor(primeiroVetor, segundoVetor, somaVetores);


        teclado.close();

    }

    private void lerValores(Scanner teclado, int primeiroVetor[], int segundoVetor[]){
        for(int i = 0; i < 10; i++){
            System.out.print("primeiro vetor: ");
            primeiroVetor[i] = teclado.nextInt();

            System.out.print("segundo vetor: ");
            segundoVetor[i] = teclado.nextInt();
        }
    }

    private void calcular(int primeiroVetor[], int segundoVetor[], int somaVetores[]) {

        for (int i=0; i < 10; i++){
            somaVetores[i] = primeiroVetor[i] + segundoVetor[i];
        }
    } 

    private void imprimirVetor(int primeiroVetor[], int segundoVetor[], int somaVetores[]) {
        System.out.println(" ");
        System.out.print("primeiro vetor: ");
  
        for (int i = 0; i < 10; i++) {
            System.out.print(primeiroVetor[i] + ", ");
        }

        System.out.println(" ");
        System.out.print("segundo vetor: ");
  
        for (int i = 0; i < 10; i++) {
            System.out.print(segundoVetor[i] + ", ");
        }

        System.out.println(" ");
        System.out.print("terceiro vetor: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(somaVetores[i] + ", ");
        }
    }

    public static void main(String[] args) {
        new Ex4();
    }
}
