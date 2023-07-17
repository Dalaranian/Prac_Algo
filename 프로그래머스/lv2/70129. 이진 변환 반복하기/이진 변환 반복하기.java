class Solution {
    public int[] solution(String s) {

        int count = 0;
        int removed = 0;
        
        while(true){
            if(s.equals("1")){
                break;
            }else if(!s.equals("1")){
                StringBuilder binaryStr = new StringBuilder();
                for(char c:s.toCharArray()){
                    if(c == '0'){
                        removed++;
                    }else{
                        binaryStr.append(c);
                    }
                }
                s = Integer.toBinaryString(binaryStr.toString().length());
            }
            count++;
        }
        
        return new int[]{count, removed};
    }
}