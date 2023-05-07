class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        boolean[] visited = new boolean[numbers.length];
        answer = dfs(numbers, target, visited, 0, 0);
        return answer;
    }

    private int dfs(int[] numbers, int target, boolean[] visited, int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        int count = 0;
        visited[index] = true;
        count += dfs(numbers, target, visited, index + 1, sum + numbers[index]);
        count += dfs(numbers, target, visited, index + 1, sum - numbers[index]);
        visited[index] = false;

        return count;
    }
}