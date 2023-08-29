import java.util.Arrays;

class Solution {
    int solution(int[][] land) {
//        for (int[] ints : land) {
//            System.out.println(Arrays.toString(ints));
//        }
//        System.out.println("-----------------------");
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < 4; j++) {
                int max = 0;
                for (int k = 0; k < 4; k++) {
                    if (j == k) continue;
                    max = Math.max(max, land[i-1][k]);
                }
                land[i][j] += max;
            }
//            for (int[] ints : land) {
//                System.out.println(Arrays.toString(ints));
//            }
//            System.out.println("-----------------------");
        }

        int answer = 0;
        for (int i = 0; i < 4; i++)
            answer = Math.max(answer, land[land.length-1][i]);

        return answer;
    }
}