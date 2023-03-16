import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int[] solution(long n) {
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        
        int reverse[] = new int[digits.length];
        for (int i = digits.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = digits[i];
        }
        return reverse;
    }
}