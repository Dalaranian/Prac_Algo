import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int num:arr){
            if(num % divisor == 0){
                list.add(num);
            }
        }
        int[] answer = null;
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}