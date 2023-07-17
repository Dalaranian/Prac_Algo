class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();

        boolean isFirstChar = true;

        for(char c:s.toCharArray()){
            if(c == ' '){
                isFirstChar = true;
                answer.append(" ");
            }else if(isFirstChar && c != ' '){
                answer.append(Character.toUpperCase(c));
                isFirstChar = false;
            }else if(!isFirstChar){
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }
}