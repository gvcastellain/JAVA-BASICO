import java.util.Scanner;

public class Ex8 {
    
    private Ex8(){
        Scanner teclado = new Scanner(System.in);
        
        int tamanhoVetor = 0;

        do {
            System.out.println("Informe o tamanho do vetor ate no maximo 20 posições: ");
            tamanhoVetor = teclado.nextInt();
        } while (tamanhoVetor < 1 && tamanhoVetor > 20 );
        
        double vetor[] = new double[tamanhoVetor];
        inserirValores(vetor, teclado);
        ordenarValores(vetor);
        teclado.close();
    }
    
    private void inserirValores(double vetor[], Scanner teclado) {
        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.println("Informe o valor do vetor ["+(i + 1)+"]:");
            vetor[i] = teclado.nextDouble();
        }
    }
    
    private void ordenarValores (double vetor[]) {
        double repetidos[] = new double[vetor.length];
        double qualNumero = 0;
        int frequencia = 0;
        int contarRepetidos = 0;
        boolean confirmar = true;
        
        for (int i = 0; i < vetor.length; i++) {
            qualNumero = vetor[i];
            for (int j = 0; j < repetidos.length; j++) {
                if (qualNumero == repetidos[j]) {
                    confirmar = false;
                }    
            }
            if (confirmar) {
                repetidos[contarRepetidos] = vetor[i];
                contarRepetidos++;
                frequencia = 0;
                for (int k = 0; k < vetor.length; k++ ) {
                      if (vetor[k] == qualNumero) {
                        frequencia++;
                    }
                }
                System.out.println("valor: " + qualNumero + " frequência: " + frequencia);
            }
            confirmar   = true;
        }
    }
    public static void main(String[] args) {
        new Ex8();
    }
}