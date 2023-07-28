import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

    public int solution(int n, int k) {
        int answer = 0;

        // K 진수로 변환
        String baseConversion = Integer.toString(n, k);

        // 요구사항에 맞게 토큰화
        StringTokenizer tokenizer = new StringTokenizer(baseConversion, "0");
        
        List<String> list = new ArrayList<>();

        // 토큰들을 List 에 저장
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }

        // BigInteger 를 활용한 소수 구하기
        for (String str : list) {
            BigInteger num = BigInteger.valueOf(Long.parseLong(str));
            if (num.isProbablePrime(100)) {
                answer++;
            }
        }

        return answer;
    }
}
