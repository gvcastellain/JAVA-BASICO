import java.util.Scanner;

public class Ex5 {
    
    private Ex5() {

        Scanner teclado = new Scanner(System.in);

        double pontos = 0;
        
        String [] m = new String[5];
        String [] f = new String[5];
        String perguntas []  = new String[5];
        
        perguntas[0] = "Gosta de música sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta da Oktoberfest?";
        
        lerValores(m, f, teclado, perguntas);
        pontos = calcular(f, m, perguntas);
        afinidade(pontos);

        teclado.close();

    }
    

    private void lerValores(String m[], String f[], Scanner teclado, String perguntas[]){
        System.out.println("informe SIM/NAO/IND: rapaz");
        for(int i = 0; i < 5; i++){
            System.out.println(perguntas[i]);
            
            System.out.print("rapaz: ");
            m[i] = teclado.next();

            System.out.print("moça: ");
            f[i] = teclado.next();
        }

    }


    private double calcular(String f[], String m[], String perguntas[]){
        double contador = 0;

        for(int i = 0; i < 5; i++){
            if (m[i].equals("SIM") && f[i].equals("SIM")){
                contador += 3;
            }

            else if (m[i].equals("IND") && f[i].equals("IND")) {
                contador += 3;
            }

            else if (m[i].equals("NAO") && f[i].equals("NAO")) {
                contador += 3;
            }



            else if (m[i].equals("SIM") && f[i].equals("IND")){
                contador += 1;
            }

            else if (m[i].equals("NAO") && f[i].equals("IND")) {
                contador += 1;
            }

            else if (m[i].equals("IND") && f[i].equals("NAO")) {
                contador += 1;
            }

            else if (m[i].equals("IND") && f[i].equals("SIM")) {
                contador += 1;
            }



            else if(m[i].equals("SIM") && f[i].equals("NAO")) {
                contador -= 2;
            }
            else if (m[i].equals("NAO") && f[i].equals("SIM")){
                contador -= 2;

            }
        }
        return contador;
    }

    private void afinidade(double pontos){
        if(pontos == 15){
            System.out.println("Casem!");

        }
        else if(pontos <= 14 && pontos >= 10){
            System.out.println("Vocês têm muita coisa em comum!");

        }
        else if(pontos <= 9 && pontos >= 5){
            System.out.println("Talvez não dê certo :(");

        }
        else if(pontos >= 0 && pontos <= 4){
            System.out.println("Vale um encontro");

        }
        else if(pontos <= -1 && pontos >= -9){
            System.out.println("Melhor não perder tempo");

        }
        else if(pontos == -10){
            System.out.println("Vocês se odeiam!");
        }
    }
    public static void main(String[] args) {
        new Ex5();    
    }
}
