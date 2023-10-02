import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        String[] numArr = new String[]{"", ""};
        for (int i : num_list) {
            if(i % 2 == 0){
                numArr[0] += i;
            }else{
                numArr[1] += i;
            }
        }
        return Arrays.stream(numArr).mapToInt(Integer::parseInt).sum();
    }
}