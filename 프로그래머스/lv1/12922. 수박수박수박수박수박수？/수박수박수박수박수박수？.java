class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String[] pattern = {"수", "박"};
        
        for(int i = 0; i < n; i++) {
            sb.append(pattern[i % 2]);
        }
        
        return sb.toString();
    }
}