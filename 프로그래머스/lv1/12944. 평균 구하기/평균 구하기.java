class Solution {
    public double solution(int[] arr) {
        double total = 0.0;
        for(int i : arr){
            total += i;
        }
        double answer = total / arr.length;
        return answer;
    }
}