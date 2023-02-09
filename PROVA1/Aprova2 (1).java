import java.util.Scanner;

public class Aprova2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a forma de pagamento");
        String pagamento = teclado.next();

        System.out.println("digite o valor");
        double valor = teclado.nextDouble();

        double desconto = valor * 0.97;

        switch (pagamento) {
            case "pix": 
                System.out.println("o valor é: " + desconto);
                break;
                
            case "debito":
                System.out.println("o valor é: " + valor);
                break;

            case "crediario":

                System.out.println("digite em quantas vezes a parcela");
                double parcelas = teclado.nextDouble();

                System.out.println("data do pagamento");
                int dataPagamento = teclado.nextInt();

                System.out.println("data do vencimento");
                int dataVencimento = teclado.nextInt();

                int atraso = dataPagamento - dataVencimento;
                double conta = ((atraso - 5) * 0.02) * 10;

                if (atraso <= 0){
                    System.out.print("pagamento em dia: " + (valor *0.9) / parcelas);
                }
                
                else if( atraso == 5){
                    System.out.print("o valor é: " + valor / parcelas );
                }
                
                else if (atraso > 5) {
                    System.out.println("o valor é: " + (valor / parcelas) + conta);
                }
                break;
        }
        teclado.close();
    }
}
