import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int n = teclado.nextInt();
    int termo = 8, anterior = 8;
    String valores = "";

    if( n > 2);{
        for(int contador = 1; contador <= n; contador++){
            if (contador > 1){
                valores += ", ";
            }

            valores += termo;

            if ( contador % 2 == 0 ){
                termo = anterior * 2;

            }
            else {
                anterior = termo;
                termo += 2;

            }

    }

}
    System.out.println(valores);

    teclado.close();

    }
}
