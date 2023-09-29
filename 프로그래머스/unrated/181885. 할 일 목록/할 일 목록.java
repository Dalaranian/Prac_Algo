import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int index = 0;
        List<String> result = new ArrayList<>();
        for (boolean b : finished) {
            if(!b){
                result.add(todo_list[index]);
            }
            index++;
        }
        return result.stream().toArray(String[]::new);
    }
}