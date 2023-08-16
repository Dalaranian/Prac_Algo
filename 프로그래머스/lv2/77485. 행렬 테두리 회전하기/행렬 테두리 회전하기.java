import java.util.Arrays;

public class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] originArr = new int[rows][columns];

        // 배열 초기화
        int startValue = 1;
        for (int i = 0; i < originArr.length; i++) {
            for (int j = 0; j < originArr[i].length; j++) {
                originArr[i][j] = startValue++;
            }
        }

        int index = 0;
        for (int[] query : queries) {
            int startI = query[0] - 1;
            int startJ = query[1] - 1;
            int endI = query[2] - 1;
            int endJ = query[3] - 1;

            int temp = originArr[startI][startJ];
            int min = temp;

            for (int i = startI; i < endI; i++) {
                originArr[i][startJ] = originArr[i+1][startJ];
                min = Math.min(min, originArr[i][startJ]);
            }
            for (int i = startJ; i < endJ; i++) {
                originArr[endI][i] = originArr[endI][i+1];
                min = Math.min(min, originArr[endI][i]);
            }
            for (int i = endI; i > startI; i--) {
                originArr[i][endJ] = originArr[i-1][endJ];
                min = Math.min(min, originArr[i][endJ]);
            }
            for (int i = endJ; i > startJ; i--) {
                originArr[startI][i] = originArr[startI][i-1];
                min = Math.min(min, originArr[startI][i]);
            }

            originArr[startI][startJ + 1] = temp;

            answer[index++] = min;
        }
        return answer;
    }
}