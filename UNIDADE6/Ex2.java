import java.util.Scanner;

public class Ex2 {
    
    private Ex2() {
        Scanner teclado = new Scanner(System.in);
        
        int tamanhoVetor = 3;
        double mediaElementos = 0;

        double vetor[] = new double[tamanhoVetor];

        lerValores(vetor, teclado);
        mediaElementos = calcularMedia(vetor);
        imprimir(vetor, tamanhoVetor, mediaElementos);
                   
        teclado.close();

    }

    private void lerValores(double vetor[], Scanner teclado) {
        for (int i = 0; i < vetor.length; i++){
            System.out.println("informe os números " + (i + 1));
            vetor[i] = teclado.nextDouble();
        }
    
    }
    
    private double calcularMedia(double vetor[]) {

        double contador = 0;

        for (int i = 0; i < vetor.length; i++ ){
            contador += vetor[i];
        }

        double media = contador / vetor.length;

        return media;
    }

    private void imprimir(double vetor[], int tamanhoVetor, double media) {
        for (int i = 0; i < vetor.length; i++ ){
            if (vetor[i] > media) {
                System.out.println(media);
                System.out.println(vetor[i]);
            }
        }
    }


    public static void main(String[] args) {
        new Ex2();
    }
}
