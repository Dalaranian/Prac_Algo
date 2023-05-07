class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }
    
    private int dfs(int[] numbers, int target, int index, int sum) {
        if (index == numbers.length) { // 모든 숫자를 다 처리한 경우
            if (sum == target) { // target과 일치하는 경우
                return 1;
            }
            return 0;
        }
        
        // 현재 인덱스의 숫자를 더할 경우와 뺄 경우 각각에 대해 재귀 호출
        int plus = dfs(numbers, target, index + 1, sum + numbers[index]);
        int minus = dfs(numbers, target, index + 1, sum - numbers[index]);
        
        return plus + minus;
    }
}
