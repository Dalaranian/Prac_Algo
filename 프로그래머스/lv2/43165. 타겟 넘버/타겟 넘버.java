class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length];
        answer = dfs(numbers, target, visited, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, boolean[] visited, int index, int sum) {
        if (index == numbers.length) {
            return (sum == target) ? 1 : 0;
        }

        return dfs(numbers, target, visited, index + 1, sum + numbers[index]) 
               + dfs(numbers, target, visited, index + 1, sum - numbers[index]);
    }
}
