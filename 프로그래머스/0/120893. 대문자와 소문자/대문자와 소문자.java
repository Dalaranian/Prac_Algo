class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            result.append(
                Character.isUpperCase(c) ? 
                    Character.toLowerCase(c) : Character.toUpperCase(c)
            );
        }
        
        return result.toString();
    }
}