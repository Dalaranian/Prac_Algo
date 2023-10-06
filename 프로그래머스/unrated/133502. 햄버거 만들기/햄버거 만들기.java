import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> hamburger = new Stack<>();
        int answer = 0;
        for (int currentIngredient : ingredient) {
            hamburger.push(currentIngredient);

            if (hamburger.size() >= 4) {
                if (hamburger.get(hamburger.size() - 1) == 1
                        && hamburger.get(hamburger.size() - 2) == 3
                        && hamburger.get(hamburger.size() - 3) == 2
                        && hamburger.get(hamburger.size() - 4) == 1
                ) {
                    answer++;
                    for (int i = 1; i <= 4; i++) {
                        hamburger.pop();
                    }
                }
            }
        }

        return answer;
    }
}