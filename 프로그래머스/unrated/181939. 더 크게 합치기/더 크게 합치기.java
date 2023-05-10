import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int numA = Integer.parseInt(""+a+b);
        int numB = Integer.parseInt(""+b+a);
        return numA>=numB?numA:numB;
    }
}