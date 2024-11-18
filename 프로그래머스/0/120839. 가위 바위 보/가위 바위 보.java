class Solution {
    public String solution(String rsp) {
        StringBuilder result = new StringBuilder();
        for(char curr : rsp.toCharArray()){
            switch (curr){
                case '2' -> result.append("0");
                case '0' -> result.append("5");
                case '5' -> result.append("2");
            }
        }
        return result.toString();
    }
}