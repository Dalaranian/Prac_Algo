import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(char c:my_string.toCharArray()){
            if(Character.isDigit(c)){
                answer += Character.getNumericValue(c);
            }
        }
        
        return answer;
    }
}