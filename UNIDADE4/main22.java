import java.util.Scanner;

public class main22 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String texto = teclado.next().toLowerCase();

        switch (texto) {
            case "ciência":
                System.out.println("Bacharel em Ciência da Computação");
                break;
            

            case "licenciatura": 
                System.out.println("Licenciado em Computação");
                break;
            

            case "sistemas":
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            
            default:
                System.out.println("entrada incorreta");
                break;

        }
    
        teclado.close();

    }
}
