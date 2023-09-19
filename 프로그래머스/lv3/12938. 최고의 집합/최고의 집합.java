import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        if (s < n) {
            // 종료조건 : 불가능할 경우
            return new int[]{-1};
        }

        int start = s / n;
        int remain = s % n;

        int[] result = new int[n];
        Arrays.fill(result, start);

        int index = 0;
        while (remain > 0) {
            if (index >= n) {
                index = 0;
            }

            result[index++]++;
            remain--;
        }
        Arrays.sort(result);
        return result;
    }
}