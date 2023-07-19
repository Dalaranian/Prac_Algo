// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {
    public int solution(int K, String[] words) {
        // 여기에 코드를 작성해주세요.
        int answer = 1;

        int current = K;

        for(String str : words){
            System.out.println(str + "의 길이 : " + str.length());
            System.out.println("남은 문자칸 : " + current);
            if(current - str.length() >= 0){
                System.out.println("집어넣기");
                current -= str.length() + 1;
            }else{
                answer++;
                current = K - str.length()-1;
            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
        int ret = sol.solution(K, words);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
}