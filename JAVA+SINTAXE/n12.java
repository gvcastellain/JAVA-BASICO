public class n12 {
    public static void main(String[] args) {
        
        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                if (c > l) {
                    break;
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
