class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
		for(int i = 0;i<=absolutes.length -1 ;i++){
            int temp = 0;
            if(signs[i]){
                temp = absolutes[i];
            }else{
                temp = absolutes[i] * -1;
            }
            answer += temp;
        }
        return answer;
    }
}