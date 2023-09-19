import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        if (s < n) {
            // 종료조건 : 불가능할 경우
            return new int[]{-1};
        }
        
        int[] result = new int[n];
        Arrays.fill(result, (s / n));

        int index = 0;
        int remain = s % n;
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
