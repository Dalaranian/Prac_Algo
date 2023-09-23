import java.math.BigInteger;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    BigInteger bigInt = new BigInteger(Integer.toString(nums[i] + nums[j] + nums[k]));
                    if(bigInt.isProbablePrime(10)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}