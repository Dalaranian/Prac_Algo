import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    
public int solution(int[] array) {
    Map<Integer, Long> collect =
            Arrays.stream(array).boxed().collect(Collectors.groupingBy(k -> k, Collectors.counting()));

    Long maxVal = collect.values().stream().max(Long::compareTo).orElseThrow(IllegalArgumentException::new);

    int maxKey = 0;
    int count = 0;
    for (Map.Entry<Integer, Long> curr : collect.entrySet()) {
        if (curr.getValue() == maxVal) {
            count++;
            maxKey = curr.getKey();
        }

        if (count >= 2) {
            return -1;
        }
    }
    return maxKey;
}
}