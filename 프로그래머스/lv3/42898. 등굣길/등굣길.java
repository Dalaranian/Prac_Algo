class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] route = new int[n][m];

        // 웅덩이 마킹
        for (int[] puddle : puddles) {
            route[puddle[1] - 1][puddle[0] - 1] = -1;
        }

        // 시작점 마킹
        route[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 웅덩이일 경우
                if (route[i][j] == -1) {
                    route[i][j] = 0;
                    continue;
                }

                if (i != 0)
                    route[i][j] += route[i - 1][j] % 1000000007;

                if (j != 0)
                    route[i][j] += route[i][j - 1] % 1000000007;
            }
        }
        return route[n - 1][m - 1] % 1000000007;
    }
}