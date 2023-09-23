import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        int index = 1;
        for (char c : my_str.toCharArray()) {
            if(index > n){
                answer.add(builder.toString());
                index = 1;
                builder = new StringBuilder();
            }
            builder.append(c);
            index++;
        }
        answer.add(builder.toString());

        return answer.stream().toArray(String[]::new);
    }
}