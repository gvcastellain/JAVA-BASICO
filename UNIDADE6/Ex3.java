import java.util.Scanner;

public class Ex3 {

    private Ex3(){
        Scanner teclado = new Scanner(System.in);

        double vetor[] = new double[12];
        
        lerValores(teclado, vetor);
        aumentaVetor(vetor);
        imprimir(vetor);

        teclado.close();

    }

    private void lerValores(Scanner teclado, double vetor[]){
        for( int i = 0; i < vetor.length; i++){
            System.out.println("informe os valores: " + (i + 1));
            vetor[i] = teclado.nextDouble();
        }

    }

    private void aumentaVetor(double vetor[]){

        for( int i = 0; i < vetor.length; i++){
            if(i % 2 == 0){
                vetor[i] *= 1.05;
            }
            else 
                vetor[i] *= 1.02;
            }
            

    }

    private void imprimir(double vetor[]){
        for( int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
        }
    }


    public static void main(String[] args) {
        new Ex3();
    }
}
