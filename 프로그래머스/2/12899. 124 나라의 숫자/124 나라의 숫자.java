class Solution {
    public String solution(int n) {
        StringBuffer buffer = new StringBuffer();

        while (n > 0) {
            // N 을 3으로 나누어 자릿수 하나를 얻는다.
            int currentLeft = n % 3;

            if (currentLeft == 0) {
                buffer.append(4);
            } else if (currentLeft == 1) {
                buffer.append(1);
            } else {
                buffer.append(2);
            }

            if(currentLeft == 0){
                n--;
            }

            n /= 3;
        }

        return buffer.reverse().toString();
    }
}