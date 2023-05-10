class Solution {
    public String solution(String my_string, int k) {
        StringBuffer sb = new StringBuffer();
        for(int i = 1;i<=k;i++){
            sb.append(my_string);
        }
        return sb.toString();
    }
}