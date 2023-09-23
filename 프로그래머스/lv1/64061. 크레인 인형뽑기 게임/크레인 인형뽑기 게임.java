import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/64061

class Solution {
    public int solution(int[][] board, int[] moves) {

//        System.out.println(Arrays.toString(moves));
//        System.out.println();
//
//        for (int[] ints : board) {
//            System.out.println(Arrays.toString(ints));
//        }
//
//        System.out.println();

        int answer = 0;
        List<Deque<Integer>> boardList = new ArrayList<>();
        for (int i = 0; i <= board[0].length - 1; i++) {
            Deque<Integer> line = new ArrayDeque<>();
            for (int j = 0; j <= board.length - 1; j++) {
                if (board[j][i] != 0) {
                    line.addLast(board[j][i]);
                }
            }
            boardList.add(line);
        }

        Stack<Integer> bucket = new Stack<>();

        for (int move : moves) {
//            System.out.println("current Move = " + move);
            if (!boardList.get(move - 1).isEmpty()) {
                // Index 에 해당하는 스택에 있는 인형을 뺴옵니다.
                Integer doll = boardList.get(move - 1).pop();
//                System.out.println("current doll : " + doll);
                // 바구니에 넣습니다.
                if (bucket.isEmpty()) {
                    bucket.push(doll);
                } else {
                    if (bucket.peek() == doll) {
                        bucket.pop();
                        answer += 2;
//                        System.out.println("Splash!");
                    } else {
                        bucket.push(doll);
                    }
                }
            }
//            System.out.println(bucket);
//            System.out.println("---------------------");
        }
        return answer;
    }
}