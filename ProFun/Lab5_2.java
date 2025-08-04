public class Lab5_2 {
    public static void main (String[] args){
        String [] arr = {"aba","bccb","adefg"};
        int i = 1;
        System.out.println();
        for (i = 0; i < arr.length; i++){
            String current = arr[i];
            int len = current.length();
            int mid = len / 2;
            boolean ans = true;
            for (int j = 0; j <mid ; j++){
                if(current.charAt(j) != current.charAt(len - j - 1)){
                    ans = false;
                    break;
                }
            }
            System.out.println(current + " is " + ans);
        }
    }
}