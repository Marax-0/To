public class Lab5Q4_1680463 {
    public static void main(String[] args){
        int countM = 0;
        int countW = 0;
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'M'){
                countM++;
            }else if (ch == 'W'){
                countW++;
            }
        }
        System.out.println("M = "+countM);
        System.out.println("W = "+countW);
    }
}
