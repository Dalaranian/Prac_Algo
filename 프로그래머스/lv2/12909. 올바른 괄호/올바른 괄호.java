import java.util.LinkedList;

class Solution {
    boolean solution(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                list.add(c);
            }else{
                if(list.isEmpty())return false;
                list.pollLast();
            }
        }
        return list.isEmpty();
    }
}