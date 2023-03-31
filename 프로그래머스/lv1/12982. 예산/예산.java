import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int money:d){
            if(budget - money >= 0){
                answer++;
                budget -= money;
            }else{
                break;
            }
        }
        return answer;
    }
}