import java.util.HashMap;

class Solution {
    public static int solution(int[] topping) {
        int n = topping.length;
        HashMap<Integer, Integer> leftCount = new HashMap<>();
        HashMap<Integer, Integer> rightCount = new HashMap<>();

        for (int t : topping) {
            rightCount.put(t, rightCount.getOrDefault(t, 0) + 1);
        }

        int fairCutCount = 0;

        for (int i = 0; i < n - 1; i++) {
            leftCount.put(topping[i], leftCount.getOrDefault(topping[i], 0) + 1);
            rightCount.put(topping[i], rightCount.get(topping[i]) - 1);

            if (rightCount.get(topping[i]) == 0)
                rightCount.remove(topping[i]);

            if (leftCount.size() == rightCount.size())
                fairCutCount++;
        }

        return fairCutCount;
    }
}