import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] splitMsg = msg.split("");
        Map<String, Integer> sajeon = new HashMap<>();

        int index = 1;
        for (int i = 'A'; i <= 'Z'; i++) {
            sajeon.put((char) i + "", index);
            index++;
        }

        for (int i = 0; i < splitMsg.length; i++) {
            String currentAlphabet = splitMsg[i];
            // 현재 문자열이 사전에 존재한다면
            if(sajeon.get(currentAlphabet) != null){
                String nextAlphabet = "";
                int nextIndex = i+1;
                // 다음 문자열을 차례대로 가져와서 사전에 등록된 문자열인지 확인하고, 등록되지 않은 문자열이라면 사전에 등록하고 다음 문자열 가져오기
                while (nextIndex < splitMsg.length) {
                    String temp = currentAlphabet + splitMsg[nextIndex];
                    if (sajeon.get(temp) != null) {
                        currentAlphabet = temp;
                        nextIndex++;
                    } else {
                        sajeon.put(temp, index++);
                        break;
                    }
                }
                // 현재 문자열의 색인 번호 출력
                answer.add(sajeon.get(currentAlphabet));
                i = nextIndex - 1;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
