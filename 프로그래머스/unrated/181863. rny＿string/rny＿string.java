class Solution {
    public String solution(String rny_string) {
        StringBuffer strBuffer = new StringBuffer();
        
        for(char c:rny_string.toCharArray()){
            if(c == 'm'){
                strBuffer.append("rn");
            }else{
                strBuffer.append(c);
            }
        }
        
        return strBuffer.toString();
    }
}