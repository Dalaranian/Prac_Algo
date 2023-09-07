import java.util.stream.*;

class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        
        return IntStream.range(0, len)
                .mapToObj(i -> i < len - 4 ? "*" : String.valueOf(phone_number.charAt(i)))
                .collect(Collectors.joining());
    }
}