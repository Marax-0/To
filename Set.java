import java.util.Scanner;
import java.util.Arrays;
public class Set {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {
            return;
        }

        int[] arrall = new int[n];

        for(int i = 0; i < n ; i++){
            arrall[i] = sc.nextInt();
        }
        Arrays.sort(arrall);
        int total = 0;
        int [] sumall = new int[n/2];
        for(int i =0;i < n ; i += 2){
            total += arrall[i] - arrall[i + 1];
        }
        total = Math.abs(total);

        System.out.println(total);
        sc.close();
    }
}
