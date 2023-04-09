import java.util.Arrays;
import java.util.Collections;

class Solution {
public static int[] solution(int[] emergency){
        Integer[] arr = new Integer[emergency.length];
        for(int i = 0;i<arr.length;i++){
            arr[i] = emergency[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int count = 1;
        int result[] = new int[emergency.length];
        for(int i:convertIntArr(arr)){
            int index = findIndex(i, emergency);
            result[index] = count;
            count++;
        }
        return result;
    }

    private static int findIndex(int num, int[] arr) {
        for(int i = 0;i< arr.length;i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }

    private static int[] convertIntArr(Integer[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            result[i] = arr[i];
        }
        return result;
    }
}