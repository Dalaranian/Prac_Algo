class Solution {
    public int solution(String my_string) {
        int result = 0;
        StringBuilder numStr = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                numStr.append(c);
            } else if (numStr.length() > 0) {
                result += Integer.parseInt(numStr.toString());
                numStr.setLength(0);
            }
        }
        
        if (numStr.length() > 0) {
            result += Integer.parseInt(numStr.toString());
        }
        
        return result;
    }
}