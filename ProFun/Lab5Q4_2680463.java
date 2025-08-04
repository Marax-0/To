public class Lab5Q4_2680463 {
    public static void main(String[] args){
        String vowel = "aeiou";
        String s1 = "I am happy";
        String ss1 = s1.toLowerCase();
        String s2 = "xyz";

        for (int i = 0; i < vowel.length(); i++){
            char ch = ss1.charAt(i);
            if (vowel.indexOf(ch) != -1){
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i < vowel.length(); i++){
            char c = s2.charAt(i);
            if (vowel.indexOf(c) == -1){  
            System.out.println(-1);
            break;
            }
        }
    }       
}
