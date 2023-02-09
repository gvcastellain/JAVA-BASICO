import java.util.Scanner;

public class GabrielVanzuita_2 {

    private GabrielVanzuita_2() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Tamanho do Vetor: ");
        int tamanhoVetor = teclado.nextInt();

        int primeiroVetor[] = new int[tamanhoVetor];
        int segundoVetor[] = new int[tamanhoVetor];
        int somaVetores[] = new int[tamanhoVetor];

        lerValores(teclado, primeiroVetor, segundoVetor);
        calcular(primeiroVetor, segundoVetor, somaVetores);
        ordenar(somaVetores);
        imprimirVetor(primeiroVetor, segundoVetor, somaVetores);


        teclado.close();

    }

    private void lerValores(Scanner teclado, int primeiroVetor[], int segundoVetor[]){
        System.out.println("___Lendo VetA___");

        for(int i = 0; i < primeiroVetor.length; i++){
            System.out.print("VetA["+i+"]: ");
            primeiroVetor[i] = teclado.nextInt();
        }   
        System.out.println("___Lendo VetB___");
            for(int i = 0; i < segundoVetor.length; i++){
            System.out.print("VetB["+i+"]: ");
            segundoVetor[i] = teclado.nextInt();
        }
    }

    private void calcular(int primeiroVetor[], int segundoVetor[], int somaVetores[]) {

        for (int i=0; i < somaVetores.length; i++){
            somaVetores[i] = primeiroVetor[i] + segundoVetor[i];
        }
    }
    
    private void ordenar(int somaVetores[]){
        int bolha;
        for (int i = 0; i < somaVetores.length; i++){
            for(int j = 0; j< somaVetores.length - 1;j++){
                if(somaVetores[j] > somaVetores[j + 1]){
                    bolha = somaVetores[j];
                    somaVetores[j] = somaVetores[j + 1];
                    somaVetores[j + 1] = bolha;
                }
            }
        }
    }

    private void imprimirVetor(int primeiroVetor[], int segundoVetor[], int somaVetores[]) {
        System.out.println("_valores ordenados.");
        System.out.println("___Resultado___ ");


        for (int i = 0; i < somaVetores.length; i++) {
            System.out.println("VetSoma["+i+"]: "+somaVetores[i]);
        }
    }

    public static void main(String[] args) {
        new GabrielVanzuita_2();
    }
}
