import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public static String solution(String s) {
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper.add(c);
            }else if(Character.isLowerCase(c)){
                lower.add(c);
            }
        }
        Collections.sort(upper, Collections.reverseOrder());
        Collections.sort(lower, Collections.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for(char c:lower){
            answer.append(c);
        }
        for(char c:upper){
            answer.append(c);
        }
        return answer.toString();
    }
}