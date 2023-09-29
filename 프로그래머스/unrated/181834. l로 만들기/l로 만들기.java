class Solution {
    public String solution(String myString) {
        char[] charArray = myString.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (char c : charArray) {
            if (c < 'l') {
                buffer.append('l');
            } else {
                buffer.append(c);
            }
        }

        return buffer.toString();
    }
}