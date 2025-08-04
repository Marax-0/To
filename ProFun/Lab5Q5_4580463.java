public class Lab5Q5_4580463 {
    public static void main(String[] args){
        int layer = 3;
        int numlines = 4;
        int numStars;
        for (int i = 0; i < layer; i++){
            numStars = (2*i)-1;
            for (int j = 0; j < numlines; j++){
                numStars += 2;
                int maxStars = (2 * (numlines - 1)) + 1 + (2 * (layer - 1));
                int space2 = (maxStars - numStars)/2;
                for (int s = 0 ; s < space2 ; s++)
                {
                System.out.print(" ");
                }
                for (int k = 0; k < numStars; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
                     }
                        }
                for (int t = 0 ; t < 3 ; t++){
                    System.out.print("    ");
                    for (int st = 0 ; st < layer ; st++){
                    System.out.print("*");
                }
                System.out.println();
        }   
    }
}