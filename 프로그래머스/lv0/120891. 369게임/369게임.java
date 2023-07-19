import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = Integer.toString(order);
        
        for(char num : orderStr.toCharArray()){
            if(num == '3' || num == '6' || num == '9'){
                answer++;
            }
        }
        
        return answer;
    }
}