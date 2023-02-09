import java.util.Scanner;

public class Ex7 {
    
    private Ex7(){

        Scanner teclado = new Scanner(System.in);
        
        int adicionar = 0; 
        int tamanhoVetor;
        boolean achou;
        
        
        do{
            System.out.println("Informe o tamanho do vetor: ");
            tamanhoVetor = teclado.nextInt();
        }while(tamanhoVetor < 1 || tamanhoVetor > 20);

        
        int vetor[] = new int[tamanhoVetor];
        
        for ( int i = 0; i < vetor.length; i++) {
            adicionar = teclado.nextInt();
            achou = colocarValores(adicionar, vetor);
            if (achou == true) {
                System.out.println("valor repetido");
                i--;
            }
            else {
                vetor[i] = adicionar;
            }
        }

        ordenarValores(vetor, adicionar);
        System.out.println("");
        imprimirVetor(vetor);
        
        teclado.close();

    }

    private boolean colocarValores(int adicionar, int vetor[]) {
        for( int i = 0; i < vetor.length; i++){
            if (vetor[i] == adicionar){
                return true;
            }
        }
        return false;
    }

    
    private void ordenarValores(int vetor[], int adicionar){
        for( int j = 0; j < vetor.length; j++){
            for (int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] > vetor[i + 1]){
                    adicionar = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = adicionar;
                }
            }
            
        }
    }

    private void imprimirVetor(int vetor[]){
        for( int i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Ex7();
    }
}
