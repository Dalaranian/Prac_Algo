class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length>=11){
            for(int i:num_list){
                answer += i;
            }
        }else{
            answer = 1;
            for(int i:num_list){
                answer *= i;
            }
        }
        return answer;
    }
}