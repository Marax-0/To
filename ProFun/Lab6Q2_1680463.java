public class Lab6Q2_1680463{
    public static void main(String[] args){
        int [] data1 = {58,4,13,15,63,9,8,81,78};
        int [] data2 = {12,14,16,18,20,22,23,25,37,38,39,40};
        boolean check = true;
        boolean check2 = true;
        
        for(int i = 0 ; i < data1.length-1 ; i++){
            if(data1[i] > data1 [i+1]){
                check = false;
                break;
            } 
        } 
        for(int o = 0 ; o < data2.length-1 ; o++){
            if(data2[o] > data2 [o+1]){
                check2 = false;
                break;
            }
        }
        if(check){
            System.out.println("T");
        }else{
            System.out.println("F");
        }
        if(check2){
            System.out.println("T");
        }else{
            System.out.println("F");
        }
    }
}