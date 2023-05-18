import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        List<Integer> answer = new ArrayList<>();
        for(int i = start;i<=end;i++){
            answer.add(i);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}