public class Lab6Q2_4680463 {
    public static void main(String[] args){
        int [] num = {1,2,3,4,5};
        String output = "";
        boolean check = false;
        
        for(int i = 0 ; i < num.length ; i++){
            for(int j = i + 1 ; j < num.length ; j++){
                if(num[i] == num[j]){
                    output += num[i] + " ";
                    check = true;
                }
            }
        }
        if(check){
            System.out.println(output);
        }else{
            System.out.println("-1");
        }
    }
}
