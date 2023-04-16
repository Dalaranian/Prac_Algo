import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        Queue<Integer> st = new LinkedList<>();
        for (int[] temp : commands) {
            System.out.println(Arrays.toString(temp));
            List<Integer> list = new ArrayList<>();
            int start = temp[0];
            int end = temp[1];
            for (int i = start - 1; i <= end - 1; i++) {
                list.add(array[i]);
            }

            // 선택정렬
            for (int i = 0; i < list.size() - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) < list.get(minIndex)) {
                        minIndex = j;
                    }
                }
                int tempNum = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, tempNum);
            }

            st.add(list.get(temp[2] - 1));
        }

        int[] answer = new int[commands.length];
        for (int i = 0; i <= answer.length - 1; i++) {
            answer[i] = st.poll();
        }
        return answer;
    }
}
