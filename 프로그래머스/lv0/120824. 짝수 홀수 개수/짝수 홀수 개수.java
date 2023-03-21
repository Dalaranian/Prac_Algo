class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        for(int i : num_list){
            if(i % 2== 0){
                answer[0] += 1;
            }else{
                answer[1] += 1;
            }
        }
        return answer;
    }
}