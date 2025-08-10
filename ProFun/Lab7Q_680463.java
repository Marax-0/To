public class Lab7Q_680463{
    public static void main(String[] args){
        System.out.println(q2_1_myIndexOf("PMRQNO", "PM"));
        System.out.println(q2_2_containsAndBefore("PMRQNO", "PM", "QNO"));
        System.out.println(q2_3_replaceWith("At KMITL CHALONGKRUNG BMI MTL","MI","CSP"));
        System.out.println(q2_4_isClockwiseRoate("KMITL", "LK"));
    }

    static int q2_1_myIndexOf(String str, String sub){
        for(int i = 0 ; i <= str.length() - sub.length() ; i++){
            boolean same = true;
            for(int j = 0 ; j < sub.length() ; j++){
                if (str.charAt(i + j) != sub.charAt(j)){
                    same = false;
                    break;
                }
            }
        if(same) return i;
        }
        return -1;
    }

    static boolean q2_2_containsAndBefore(String input,String sub1,String sub2){
        int index1 = -1;
        int index2 = -1;

        for(int i = 0 ; i <= input.length() - sub1.length() ; i++){
            if(input.startsWith(sub1,i)){
                index1 = i;
                break;
            }
        }
        for(int i = 0 ; i <= input.length() - sub2.length() ; i++){
            if(input.startsWith(sub2,i)){
                index2 = i;
                break;
            }
        }
        return (index1 != -1 && index2 != -1 && index1 < index2);
    }

    static String q2_3_replaceWith(String str,String pattern,String newPattern){
        String result = "";
        for(int i = 0 ; i < str.length() ; i++){
            boolean macth = true;
            if(i + pattern.length() <= str.length()){
                for(int j = 0 ; j < pattern.length() ; j++){
                    if(str.charAt(i + j) != pattern.charAt(j)){
                        macth = false;
                        break;
                    }
                }
            }else macth = false;
        if(macth){
        for(int j = 0 ; j < newPattern.length() ; j++)
            result += newPattern.charAt(j);
            i += pattern.length() - 1;
            }else result += str.charAt(i);
        }
        return result;
    }

    static boolean q2_4_isClockwiseRoate(String str,String pattern){
        if(pattern.length() > str.length()) return false;
        String doublet = str + str;
        return doublet.contains(pattern);
    }
}