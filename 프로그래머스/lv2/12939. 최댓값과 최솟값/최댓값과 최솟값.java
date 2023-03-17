import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] raw = s.split(" ");
        int[] sorted = new int[raw.length];
        for (int i = 0; i <= sorted.length - 1; i++) {
            sorted[i] = Integer.parseInt(raw[i]);
        }
        Arrays.sort(sorted);

        answer = sorted[0] + " " + sorted[sorted.length-1];
        return answer;
    }
}