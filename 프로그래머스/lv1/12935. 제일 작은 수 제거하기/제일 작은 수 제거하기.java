import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class Solution {
    public int[] solution(int[] arr) {
       ThreadLocalRandom r = ThreadLocalRandom.current();
        int[] answer = {};
        if(arr.length==1){
            answer = new int[1];
            answer[0] = -1;
            return  answer;
        }else {
            int min = arr[r.nextInt(arr.length - 1)];
            for (int i : arr) {
                if (min > i) {
                    min = i;
                }
            }
            List<Integer> list = new ArrayList<>();
            for (int i : arr) {
                if (i != min) {
                    list.add(i);
                }
            }
            answer = new int[arr.length-1];
            for(int i = 0;i<answer.length;i++){
                answer[i] = list.get(i);
            }
        }
        return answer;
    }
}