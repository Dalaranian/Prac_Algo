class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int min_move = len - 1;
        
        for(int i = 0; i < len; i++) {
            int curr_alphabet_idx = (int) name.charAt(i);
            int middleOfAlphabet = (int) 'M';

            if(curr_alphabet_idx <= middleOfAlphabet) {
                answer += curr_alphabet_idx - 'A';
            } else {
                answer += 'Z' - curr_alphabet_idx + 1;
            }

            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }

            min_move = Math.min(min_move, i + len - next + Math.min(i, len - next));
        }

        answer += min_move;
        return answer;
    }
}