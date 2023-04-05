import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        char[] strToChar = my_string.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(char c : strToChar){
            if(c >= '0' && c <= '9'){
                list.add(Character.getNumericValue(c));
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}