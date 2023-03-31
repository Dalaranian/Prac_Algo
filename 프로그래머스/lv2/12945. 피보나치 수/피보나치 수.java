class Solution {
    public int solution(int n) {
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % 1234567;
            a = b;
            b = c;
        }
        return c;
    }
}
