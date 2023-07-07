import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = Integer.toString(num);
        answer = numStr.indexOf(Integer.toString(k));
        return answer != -1?answer + 1: answer;
    }
}