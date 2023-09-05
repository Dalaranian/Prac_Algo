import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }
        
        int[] answer = new int[n];
        k--;
        
        long[] factorial = new long[n];
        factorial[0] = 1;
        
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        for (int i = n - 1; i >= 0; i--) {
            int index = (int) (k / factorial[i]);
            answer[n - i - 1] = people.remove(index);
            k %= factorial[i];
        }
        
        return answer;
    }
}