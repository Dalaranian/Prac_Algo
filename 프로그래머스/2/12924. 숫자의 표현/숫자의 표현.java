class Solution {
    private int target;

    public int solution(int n) {
        this.target = n;
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (canSumable(i)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean canSumable(int start) {
        int total = 0;
        for (int i = start; i <= target; i++) {
            total += i;
            if(total == target){
                return true;
            }else if(total > target){
                return false;
            }
        }
        return false;
    }
}