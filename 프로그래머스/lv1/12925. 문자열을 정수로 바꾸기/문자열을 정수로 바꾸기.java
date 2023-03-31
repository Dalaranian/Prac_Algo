class Solution {
    public int solution(String str) {
        String strNum = "";
        boolean oper = true;
        for(char c:str.toCharArray()){
            if(c == '-'){
                oper = false;
            }else if(c == '+'){
                continue;
            }else{
                strNum += c;
            }
        }

        int num = Integer.parseInt(strNum);
        return oper?num:num*-1;
    }
}