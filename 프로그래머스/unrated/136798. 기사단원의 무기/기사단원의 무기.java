class Solution {
    public int solution(int number, int limit, int power) {
        // 기사단원 약수 갯수를 저장할 배열을 생성합니다.
        int[] knight = new int[number + 1];

        // 각 숫자들이 몇 번 나누어지는지 계산합니다.
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                knight[j]++;
            }
        }

        // limit 와 비교하여 무게에 추가합니다.
        int weight = 0;
        for (int currentWeight : knight) {
            weight += currentWeight <= limit ? currentWeight : power;
        }
        
        return weight;
    }
}