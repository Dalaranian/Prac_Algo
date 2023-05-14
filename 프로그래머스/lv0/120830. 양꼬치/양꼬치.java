class Solution {
    public static final int LAMB_SKEWERS_PRICE = 12000;
    public static final int COKE_PRICE = 2000;
    public int solution(int n, int k) {
        return (LAMB_SKEWERS_PRICE * n) + (COKE_PRICE * k) - ((n/10) * 2000);
    }
}