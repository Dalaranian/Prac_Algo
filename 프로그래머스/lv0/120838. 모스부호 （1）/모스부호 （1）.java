import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
    public String solution(String letter) {
        StringBuilder result = new StringBuilder();
        HashMap<String, Character> morseCode = generateMorseCode();
        StringTokenizer token = new StringTokenizer(letter);
        while (token.hasMoreTokens()){
            String current = token.nextToken();
            result.append(morseCode.get(current));
        }
        return result.toString();
    }

    private HashMap<String, Character> generateMorseCode() {
        HashMap<String, Character> result = new HashMap<>();
        int index = 97;
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (String s : morse) {
            result.put(s, (char) index);
            index++;
        }
        return result;
    }
}