import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        
    
    Scanner teclado = new Scanner(System.in);

    int diaVencimento = teclado.nextInt();
    int diaPagamento = teclado.nextInt();
    double valor = teclado.nextDouble();

    double data = diaPagamento - diaVencimento;
    double desconto = valor*0.9;
    double amais = ((diaPagamento - diaVencimento) *0.02) *10;
    double atraso = valor + amais;

    if ( data <= 0 ){
        System.out.println("vencimento " + diaVencimento);
        System.out.println("pagamento " + diaPagamento);
        System.out.println("prestação " + valor);
        System.out.println("total " + desconto);
    }

    else if ( data >= 1 && data <= 5){
        System.out.println("vencimento " + diaVencimento);
        System.out.println("pagamento " + diaPagamento);
        System.out.println("prestação " + valor);
        System.out.println("total " + valor);
    }

    else if ( data > 5 ){
        System.out.println("vencimento " + diaVencimento);
        System.out.println("pagamento " + diaPagamento);
        System.out.println("prestação " + valor);
        System.out.println("total " + atraso);
    }

    teclado.close();

    }
}
