import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[][] origin = makeOriginArr(n);
        return makeResult(origin, n);
    }

    private int[] makeResult(int[][] origin, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int[] ints : origin) {
            for (int anInt : ints) {
                if(anInt == 0){

                }else{
                    answer.add(anInt);
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[][] makeOriginArr(int n) {
        int[][] origin = new int[n][n];

        int x = -1;
        int y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                origin[x][y] = num++;
            }
        }

        return origin;
    }
}