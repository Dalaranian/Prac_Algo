class Solution {
    public String solution(int n) {
        String answer = "";
        
        boolean flag = true;
        
        for(int i = 1; i <= n;i++){
            if(flag){
                answer += "수";
                flag = false;
            }else{
                answer += "박";
                flag = true;
            }
        }
        
        return answer;
    }
}