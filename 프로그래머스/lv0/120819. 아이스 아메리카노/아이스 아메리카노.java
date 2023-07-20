class Solution {
    public int[] solution(int money) {
        int count = 0;
        while(true){
            if((money - 5500) >= 0){
                count++;
                money -= 5500;
            }else{
                break;
            }
        }
        return new int[]{count, money};
    }
}