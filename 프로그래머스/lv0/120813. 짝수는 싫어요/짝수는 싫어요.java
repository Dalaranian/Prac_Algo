import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                Integer tmp = i;
                list.add(tmp);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}