class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder builder = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if(alp.equals(String.valueOf(c))){
                builder.append(Character.toUpperCase(c));
            }else{
                builder.append(c);
            }
        }

        return builder.toString();
    }
}