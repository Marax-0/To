import java.util.Scanner;
public class Test1 {
     static void Method(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N\nInput M");
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n + m);
    }
    public static void main(String[] args){
        Method();
    }
}
