import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).map(n -> n * 2).toArray();
        return answer;
    }
}