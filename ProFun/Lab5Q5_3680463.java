public class Lab5Q5_3680463 {
    public static void main(String[] args){
        int n = 4;
        for (int i = 0 ; i < n ; i++){  //1
            for(int s = 0 ; s < n - i - 1 ; s++){  //2 
                System.out.print(" ");
            }
            for(int p = 0 ; p < 2 * i + 1 ; p++){  //3
                System.out.print("P");
            }
        System.out.println();
        }
    }
}
