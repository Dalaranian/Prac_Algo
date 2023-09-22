import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> result = new ArrayList<>();
        for(int i = n-1;i<= num_list.length-1;i++){
            result.add(num_list[i]);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}