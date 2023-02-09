import java.util.Scanner;

public class Ex6 {

    private Ex6() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("informe o tamanho do vetor: ");
        int tamanhoVetor = teclado.nextInt();

        double vetor[] = new double[tamanhoVetor];

        lerValores(teclado, vetor);

        if (verificarValor(teclado, vetor) == true){
            System.out.println("encontrou");
        }

        else {
            System.out.println("não encontrou");
        }

        teclado.close();

    }

    private void lerValores(Scanner teclado, double vetor[]){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("informe os valores: " + (i + 1));
            vetor[i] = teclado.nextDouble();
        }
    }

    private boolean verificarValor(Scanner teclado, double vetor[]) {
        System.out.println("informe um valor a ser verificado: ");
        double valorPesquisa = teclado.nextDouble();

        for( int i = 0; i < vetor.length; i++){
            if (vetor[i] == valorPesquisa){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        new Ex6();
    }
}
