import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> set = IntStream.of(numbers).boxed().collect(Collectors.toSet());
        int answer = 0;
        for(int i = 0;i<= 9;i++){
            if(!set.contains(i)){
                answer += i;
            }
        }
        return answer;
    }
}