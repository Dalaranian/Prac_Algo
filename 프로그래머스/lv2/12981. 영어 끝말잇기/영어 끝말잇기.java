import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashSet<String> set = new HashSet<>();
        char prev = words[0].charAt(words[0].length() - 1);
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (prev != first || set.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                set.add(words[i]);
                prev = last;
            }
        }
        return answer;
    }
}