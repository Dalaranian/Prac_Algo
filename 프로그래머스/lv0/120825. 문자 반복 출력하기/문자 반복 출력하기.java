class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c:my_string.toCharArray()){
            sb.append(String.valueOf(c).repeat(n));
        }
        return sb.toString();
    }
}