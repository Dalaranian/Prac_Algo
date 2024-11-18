import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(" ", -1))
                .map(row -> row.split(""))
                .map(row -> {
                            int idx = 0;
                            StringBuilder result = new StringBuilder();
                            for (String str : row) {
                                if (idx % 2 == 0) {
                                    result.append(str.toUpperCase());
                                } else {
                                    result.append(str.toLowerCase());
                                }
                                idx++;
                            }
                            return result.toString();
                        }
                ).collect(Collectors.joining(" "));
    }
}