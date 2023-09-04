import java.util.HashMap;

public class Solution {
    public int solution(String word) {
        HashMap<Character, Integer> dictionary = makeDictionary();
        int answer = 0;
        int mul = 781; 

        for(char c : word.toCharArray()){
            answer += dictionary.get(c) * mul;
            // 자리수 이동시, 가중치를 줄입니다. 
            mul /= 5;
        }

        return answer + word.length(); 
    }

    // 가중치를 저장할 HashMap 을 만듭니다. 
    private HashMap<Character, Integer> makeDictionary() {
        HashMap<Character, Integer> digit = new HashMap<>();
        digit.put('A', 0);
        digit.put('E', 1);
        digit.put('I', 2);
        digit.put('O', 3);
        digit.put('U', 4);

       return digit;
    }
}