class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();

        char char1 = charArray[num1];
        char char2 = charArray[num2];

        charArray[num1] = char2;
        charArray[num2] = char1;

        return new String(charArray);
    }
}