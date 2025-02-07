import java.util.stream.IntStream;


class Solution {
    public int[] solution(int l, int r) {
        int[] array = IntStream.range(l, r + 1)
                .filter(i -> String.valueOf(i).matches("^[05]+$"))
                .toArray();

        return array.length > 0 ? array : new int[]{-1};
    }
}