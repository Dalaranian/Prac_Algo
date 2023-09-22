class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        int index = code;
        char[] chars = cipher.toCharArray();
        while (true) {
            try {
                answer.append(chars[index - 1]);
                index += code;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        return answer.toString();
    }
}