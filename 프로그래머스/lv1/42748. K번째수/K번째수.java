import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
             Queue<Integer> st = new LinkedList<>();
        for (int[] temp : commands) {
            System.out.println(Arrays.toString(temp));
            List<Integer> list = new ArrayList<>();
            int start = temp[0];
            int end = temp[1];
            for(int i = start-1;i<=end -1;i++){
                list.add(array[i]);
            }
            //나중에 정렬알고리즘 짜야지
            Collections.sort(list);
            st.add(list.get(temp[2]-1));
        }
        int[] answer = new int[commands.length];
        for(int i = 0;i<=answer.length-1;i++){
            answer[i] = st.poll();
        }
        return answer;
    }
}