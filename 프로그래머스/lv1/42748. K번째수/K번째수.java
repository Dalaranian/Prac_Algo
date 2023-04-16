import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] subArray = Arrays.copyOfRange(array, start, end);
            // 선택정렬(Selection Sort)
            for (int j = 0; j < subArray.length - 1; j++) {
                int minIndex = j;
                for (int m = j + 1; m < subArray.length; m++) {
                    if (subArray[m] < subArray[minIndex]) {
                        minIndex = m;
                    }
                }
                int temp = subArray[j];
                subArray[j] = subArray[minIndex];
                subArray[minIndex] = temp;
            }

            answer[i] = subArray[k];
        }

        return answer;
    }
}
