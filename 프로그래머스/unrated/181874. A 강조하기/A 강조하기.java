import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuilder builder = new StringBuilder();
        
        for(char c:myString.toCharArray()){
            if(c == 'a' || c == 'A'){
                builder.append("A");
            }else{
                builder.append(Character.toLowerCase(c));
            }
        }
        
        return builder.toString();
    }
}