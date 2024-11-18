import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
                return Arrays.stream(rsp.split("")).map(row -> {
                    switch (row){
                        case "2" -> {
                            return "0";
                        }
                        case "0" -> {
                            return "5";
                        }
                        case "5" -> {
                            return "2";
                        }
                        default -> throw new IllegalArgumentException();
                    }
                }
        ).collect(Collectors.joining());
    }
}