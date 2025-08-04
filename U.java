public class U {
    public static void main (String[] args){
        int[] arr = {1, 1, 2, 2, 2, 7, 3, 3, 3, 4};
        int n = 10;
        int mode = arr[0];         // mode = 1
        int currentCount = 1;      // เจอ 1 ไปแล้ว 1 ตัว
        int maxFreq = 0;

        for (int index = 1; index < n; index++) {
            if (arr[index] == arr[index - 1]) {
            currentCount++; // เจอค่าซ้ำ
                if (currentCount > maxFreq) {
                mode = arr[index];
                maxFreq = currentCount;
                }
            } else {
                currentCount = 1; // ค่าเปลี่ยน เริ่มนับใหม่
            }
            }

            int lastValue = arr[n-1];
            if (currentCount > maxFreq) {
            mode = lastValue;
            maxFreq = currentCount;
            }
            System.out.println(mode + " has max Frequency of " + maxFreq);
        }
    }
