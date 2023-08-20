public class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] numX = counting(X);
        int[] numY = counting(Y);

        for (int i = 9; i >= 0; i--) {
            int common = Math.min(numX[i], numY[i]);
            for (int j = 0; j < common; j++) {
                answer.append(i);
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }

    private int[] counting(String str) {
        int[] result = new int[10];
        for (char c : str.toCharArray()) {
            result[Character.getNumericValue(c)]++;
        }
        return result;
    }
}