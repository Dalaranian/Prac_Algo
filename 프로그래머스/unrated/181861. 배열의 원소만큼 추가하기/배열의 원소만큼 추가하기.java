import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i:arr){
            for(int count = 1;count<=i;count++){
                list.add(i);
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}