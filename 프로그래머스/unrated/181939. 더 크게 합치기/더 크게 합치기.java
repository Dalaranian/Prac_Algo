import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = Integer.parseInt(""+a+b);
        int num2 = Integer.parseInt(""+b+a);
        if(num1 >= num2){
            return num1;
        }else{
            return num2;
        }
    }
}