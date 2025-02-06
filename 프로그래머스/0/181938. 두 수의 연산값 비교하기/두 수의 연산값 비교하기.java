class Solution {
    public int solution(int a, int b) {
            int merge = Integer.parseInt(new StringBuilder().append(a).append(b).toString());
            return Math.max(merge, (2 * a * b));
        }
}