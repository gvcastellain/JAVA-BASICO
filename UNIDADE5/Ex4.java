public class Ex4 {
    public static void main(String[] args) {
        
    double aBaixo = 0, contaBaixo = 0, totalBaixo = 0, somaBaixo = 0, somaCima = 0;
        for(double baixo = 2; baixo <= 40; baixo = baixo+2){
            
            aBaixo += baixo;
            contaBaixo = aBaixo - baixo;
            totalBaixo = contaBaixo + baixo;
            somaBaixo += totalBaixo;
            }
            for(double cima = 3; cima <= 42; cima = cima + 2){
                somaCima += cima;
            }
            System.out.println(somaCima / somaBaixo);

    }
}    

