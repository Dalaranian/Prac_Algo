import java.util.HashMap;

class Solution {
    public int solution(String s) {
        HashMap<String, String> wordToNum = new HashMap<String, String>();
        wordToNum.put("zero", "0");
        wordToNum.put("one", "1");
        wordToNum.put("two", "2");
        wordToNum.put("three", "3");
        wordToNum.put("four", "4");
        wordToNum.put("five", "5");
        wordToNum.put("six", "6");
        wordToNum.put("seven", "7");
        wordToNum.put("eight", "8");
        wordToNum.put("nine", "9");
        
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                word.append(c);
                if (wordToNum.containsKey(word.toString())) {
                    sb.append(wordToNum.get(word.toString()));
                    word.setLength(0);
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
