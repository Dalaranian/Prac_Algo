class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();

        boolean isFirstChar = true;

        for(char c:s.toCharArray()){
            if(Character.isWhitespace(c)){
                isFirstChar = true;
                answer.append(" ");
            }else if(isFirstChar && !Character.isWhitespace(c)){
                answer.append(Character.toUpperCase(c));
                isFirstChar = false;
            }else if(!isFirstChar){
                answer.append(Character.toLowerCase(c));
            }
        }

        return answer.toString();
    }
}