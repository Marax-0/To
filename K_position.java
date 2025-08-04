import java.util.Scanner;
import java.util.Arrays;

public class K_position{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        sc.close();

        int[] sumArray = new int[n];
        for(int i = 0;i < n;i++){
            sumArray[i] = arr1[i] + arr2[i];
        }
        Arrays.sort(sumArray);

        System.out.println(sumArray[n - k]);
    }
}