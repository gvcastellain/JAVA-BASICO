public class Aprova1 {
    public static void main(String[] args) {
     
    String temperatura = "baixa";
    String clima = "seco";

    if(temperatura.equals("") && clima.equals("")){
        System.out.println(temperatura + clima);
        System.out.println("FINALIZADO");
    }

    else if (clima.equals("")) {
        System.out.println("Clima Vazio");
        System.out.println("Temperatura Vazia");
        System.out.println("FINALIZADO");

        }
    
    else {
        System.out.println("Temperatura e clima");
        System.out.println("FINALIZADO");

    }

    

    }    
}
