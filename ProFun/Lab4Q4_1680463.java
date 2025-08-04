import java.util.Scanner;

public class Lab4Q4_1680463 {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input number: ");
        int o = sc.nextInt();
        int num = 2;
        int c = 0;
        while (c < o) {
            int sum = 0;
            for (i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println("Perfect number: " + num);
                c++;
            }
            num++;
        }
        sc.close();
    }
}