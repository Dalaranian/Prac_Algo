import java.util.HashSet;

public class Solution {
    public String solution(String bus) {
        HashSet<Character> dictionary = new HashSet<>();
        dictionary.add('a');
        dictionary.add('e');
        dictionary.add('i');
        dictionary.add('o');
        dictionary.add('u');

        StringBuilder result = new StringBuilder();
        for (char c : bus.toCharArray()) {
            if (!dictionary.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}