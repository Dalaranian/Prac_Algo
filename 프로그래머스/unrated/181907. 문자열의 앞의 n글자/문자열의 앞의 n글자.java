class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c:my_string.toCharArray()){
            if(count >= n){
                break;
            }else{
                sb.append(c);
                count++;
            }
        }
        return sb.toString();
    }
}