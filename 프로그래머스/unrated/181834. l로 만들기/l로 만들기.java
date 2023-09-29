class Solution {
    public String solution(String myString) {
        StringBuffer buffer = new StringBuffer();
        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                buffer.append('l');
            } else {
                buffer.append(c);
            }
        }

        return buffer.toString();
    }
}