public class Lab6Q2_3680463 {
    public static void main(String[] args){
        String input = "KMITL";
        String output = "";

        for(int i = 1 ; i < input.length()-1 ; i ++){
            output += input.charAt(i);
        }
    System.out.println(output);
    }
}
