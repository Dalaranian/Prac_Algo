class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder builder = new StringBuilder();
        for(int i:index_list){
            builder.append(my_string.charAt(i));
        }
        return builder.toString();
    }
}