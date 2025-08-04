import java.util.Scanner;
public class Lab4Q4_2680463{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] i = input.split(" ");
            for(String each : i){
                int x = Integer.parseInt(each);
                int sum =0;

                int temp = x;
                while(temp > 0){
                    sum += temp % 10;
                    temp /= 10;
                }
                if(sum == 9){
                    System.out.printf("true\t");
                }else{
                    System.out.printf("false\t");
                }
            }
            sc.close();
    }
}