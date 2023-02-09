public class Ex2 {
    public static void main(String[] args) {
        

    int par = 0, imp = 0;

    for ( int contador = 1; contador <= 100; contador++){
        if (contador % 2 == 0){
            par += contador;
            System.out.println("par " + par);
            
        }

        else {
            imp += contador;
            System.out.println("imp " + imp);
        }
    }




    }
}
