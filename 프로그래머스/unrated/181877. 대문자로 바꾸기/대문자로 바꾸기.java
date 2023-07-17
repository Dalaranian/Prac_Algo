class Solution {
    public String solution(String myString) {
        StringBuffer strBuffer = new StringBuffer();
        
        for(char c: myString.toCharArray()){
            strBuffer.append(Character.toUpperCase(c));
        }
        
        return strBuffer.toString();
    }
}