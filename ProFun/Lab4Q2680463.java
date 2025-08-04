public class Lab4Q2680463 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide three prices as command line arguments.");
            return;
        }
        int price1,price2,price3,result;
        price1 = Integer.parseInt(args[0]);
        price2 = Integer.parseInt(args[1]);
        price3 = Integer.parseInt(args[2]);
        if(price1 <= price2 && price1 <= price3) {
            result = price2+price3;
        } else if(price2 <= price1 && price2 <= price3) {
            result = price1+price3;
        } else {
            result = price1+price2;
        }
        System.out.println("The minimum price is: " + result);
    }
}