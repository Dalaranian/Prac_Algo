import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> key = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (String s : keymap) {
            char[] charArray = s.toCharArray();
            for (int i = 1; i <= charArray.length; i++) {
                if (!key.containsKey(charArray[i - 1])) {
                    key.put(charArray[i - 1], i);
                } else {
                    key.put(charArray[i - 1], Math.min(key.get(charArray[i - 1]), i));
                }
            }
        }


        for (String target : targets) {
            int cnt = 0;
            boolean flag = true;
            for (char currentChar : target.toCharArray()) {
                if (key.containsKey(currentChar)) {
                    cnt += key.get(currentChar);
                } else if (flag) {
                    answer.add(-1);
                    flag = false;
                }
            }
            if (flag) {
                answer.add(cnt);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}