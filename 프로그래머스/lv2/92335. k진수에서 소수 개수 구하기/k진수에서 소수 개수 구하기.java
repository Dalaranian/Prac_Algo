import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        String baseConversion = Integer.toString(n, k);
        
        StringTokenizer tokenizer = new StringTokenizer(baseConversion, "0");

        List<String> list = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }

        for (String str : list) {
            BigInteger num = BigInteger.valueOf(Long.parseLong(str));
            if (num.isProbablePrime(100)) {
                answer++;
            }
        }

        return answer;
    }
}