import java.util.ArrayList;

class Solution {
    public int[] solution(String[] strlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String str:strlist){
            list.add(str.length());
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}