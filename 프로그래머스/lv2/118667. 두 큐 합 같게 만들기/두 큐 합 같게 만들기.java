import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int[] ints1, int[] ints2) {
        Queue<Integer> queue1 = makeQueue(ints1);
        Queue<Integer> queue2 = makeQueue(ints2);

        long totalAll = sumQueue(queue1) + sumQueue(queue2);

        // 성립이 안되는 조건
        if (totalAll % 2 != 0) {
            return -1;
        } else {
            long target = totalAll / 2;
            int count = 0;
            long queue1Total = sumQueue(queue1);
            long queue2Total = sumQueue(queue2);
            // 로직 시작
            while (true) {
                // 종료 조건 1. 모두 탐색해도 안됨
                if (count > (ints1.length + ints2.length) * 2) {
                    count = -1;
                    break;
                }
                // 종료 조건 2. 두 큐의 크기가 동일해, 정답을 구함
                if (queue1Total == target && queue2Total == target) {
                    break;
                } else if (queue1Total > target) {
                    Integer poll = queue1.poll();
                    
                    queue1Total -= poll.longValue();
                    queue2Total += poll.longValue();
                    
                    queue2.add(poll);
                } else {
                    Integer poll = queue2.poll();

                    queue1Total += poll.longValue();
                    queue2Total -= poll.longValue();
                    
                    queue1.add(poll);
                }
                count++;
            }

            return count;
        }
    }

    private long sumQueue(Queue<Integer> queue) {
        return queue.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private Queue<Integer> makeQueue(int[] ints) {
        Queue<Integer> result = new LinkedList<>();
        for (int num : ints) {
            result.add(num);
        }
        return result;
    }
}
