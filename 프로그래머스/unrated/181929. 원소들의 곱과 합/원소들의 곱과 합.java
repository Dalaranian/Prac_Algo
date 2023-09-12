import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();
        int product = Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
        
        return product < (sum*sum)?1:0;
    }
}