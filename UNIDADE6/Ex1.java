import java.util.Scanner;

public class Ex1 {

    private Ex1(){
        Scanner teclado = new Scanner(System.in);

        int tamanhoVetor = 10;
        int vetor[] = new int[tamanhoVetor];

        lerValores(teclado, vetor);
        System.out.println("----------");
        imprimir(tamanhoVetor, vetor);

        teclado.close();
    }

    private void lerValores(Scanner teclado, int vetor[]){
        for (int i = 0; i < vetor.length; i++){
            System.out.println("informe um número: " + (i + 1));
            vetor[i] = teclado.nextInt();
    }
}

    private void imprimir(int tamanhoVetor, int vetor[]) {
        for (int i = tamanhoVetor - 1; i < vetor.length; i--){
            System.out.println(vetor[i]);
        }

    }


    public static void main(String[] args) {
        new Ex1();
    }
}
