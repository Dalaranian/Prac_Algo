import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}