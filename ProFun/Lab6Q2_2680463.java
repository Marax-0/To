public class Lab6Q2_2680463 {
    public static void main(String[] args){
        String  input = "10 10 10 01 10 10";
        String[] token = input.split(" ");
        String pre = "";
        
        int segments = 0;
        for(String current : token){
            if(!current.equals(pre)){
                segments++;
                pre = current;
            }
        }
        System.out.println(segments);
    }
}