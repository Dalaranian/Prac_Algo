class Solution {
    public String solution(String rny_string) {
        StringBuffer strBuffer = new StringBuffer();
        
        for(char c:rny_string.toCharArray()){
            strBuffer.append(c == 'm' ? "rn" : c);
        }
        
        return strBuffer.toString();
    }
}