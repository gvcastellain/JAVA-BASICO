import java.util.Scanner;

public class Ex9 {
    
    private Ex9() {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[3][30];
        double media = 0;

        metRespostas(matriz, teclado);
        media = Media(matriz);
        System.out.println("A média do cinema é de: "+media);
        MediaHomem(matriz);
        NotaMulherJovem(matriz);
        notaMediaMulheres50(matriz);
    }

    private void metRespostas(int matriz[][], Scanner teclado) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Qual o seu sexo\n1 - Feminino\n2 - Masculino\n");
            matriz[0][i] = teclado.nextInt();
            System.out.println("Qual à sua nota para o cinema?");
            matriz[1][i] = teclado.nextInt();
            System.out.println("Qual é a sua idade?");
            matriz[2][i] = teclado.nextInt();
            System.out.println("\033[H\033[2J");
        }
        teclado.close();
    }

    private double Media(int matriz[][]) {
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            media = media + matriz[1][i];
        }
        media /= 30.0;
        return media;
    }

    private void MediaHomem(int matriz[][]) {
        double mediaHomens = 0;
        double contaHomens = 0;
        boolean zeroHomens = true;
        for (int i = 0; i < matriz.length; i++ ) {
            if (matriz[0][i] == 2 && zeroHomens) {
                mediaHomens = mediaHomens + matriz[1][i];
                contaHomens++;
                zeroHomens = false;
            } else if  (matriz[0][i] == 2) {
            mediaHomens = mediaHomens + matriz[1][i];
            contaHomens++;
           }
        }
        if (zeroHomens) {
            System.out.println("Não houveram homens nesta pequisa.");
        } else {
        mediaHomens /= contaHomens;
        System.out.println("A média das notas dos homens é de: " + mediaHomens);
        }
    }
    
    private void NotaMulherJovem(int matriz[][]) {
        int nota = 0;
        int idadeMulherMaisJovem = 0;
        boolean zeroHomens = true;
        for (int i = 0; i < matriz.length ; i++) {
            if (matriz[0][i] == 1 && zeroHomens) {
                idadeMulherMaisJovem = matriz[2][i];
                nota = matriz[1][i];
                zeroHomens = false;
            } 
            if (matriz[0][i] == 1) {
                if (idadeMulherMaisJovem > matriz[2][i]) {
                    idadeMulherMaisJovem = matriz[2][i];
                    nota = matriz[1][i];
                }
            }
        }
        if (zeroHomens) {
            System.out.println("Não houveram mulheres na pesquisa.");
        } else {
            System.out.println("A nota atríbuida pela mulher mais jovem é: "+nota);
        }
    }
    
    private void notaMediaMulheres50(int matriz[][]) {
        int contMulheres50 = 0;
        double mediaTotal = Media(matriz); 
        boolean zeroHomens = true;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[0][i] == 1 && matriz[2][i] > 50 && zeroHomens && matriz[1][i] > mediaTotal) {
                contMulheres50++;
                zeroHomens = false;
            } else if (matriz[0][i] == 1 && matriz[2][i] > 50 && matriz[1][i] > mediaTotal) {
                contMulheres50++;
            }
        }
        if (zeroHomens) {
            System.out.println("Não existem mulheres com mais de 50 anos nesta pesquisa");
        } else {
            System.out.println("A quantidade de mulheres com mais de 50 anos que deram nota superior a média: "+contMulheres50);
        }
    }
    public static void main(String[] args) {
        new Ex9();
    }
}