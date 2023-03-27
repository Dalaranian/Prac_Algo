class Solution {
    public int solution(int num) {
        long current = num;
        for (int i = 0; i < 500; i++) {
            if (current == 1) {
                return i;
            } else if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }
        return -1;
    }
}
