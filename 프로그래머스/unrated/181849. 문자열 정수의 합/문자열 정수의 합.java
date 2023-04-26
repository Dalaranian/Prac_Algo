import java.util.*;

class Solution {
    public int solution(String num_str) {
        int answer= 0;
        for(char c:num_str.toCharArray()){
            answer+= Character.getNumericValue(c);
        }
        return answer;
    }
}