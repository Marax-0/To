public class Lab5Q5_1680463{
    public static void main(String[] args){
        int n =10;
        int line = 10;
        for (int l = 0 ; l <= line ; l++){
            for(int i = 0 ; i < n ; i++ ){
                if(i == l || i == n-1-l ){
                    System.out.print(" ");
                }else{
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }
}