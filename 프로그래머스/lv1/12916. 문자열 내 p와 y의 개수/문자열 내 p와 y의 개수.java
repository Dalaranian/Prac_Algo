class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int P = 0;
        int Y = 0;

        for(char c : s.toCharArray()){
            if(c == 'p' || c=='P'){
                P++;
            }else if(c == 'y' || c == 'Y'){
                Y++;
            }
        }

        if(P != Y){
            answer = false;
        }

        return answer;
    }
}