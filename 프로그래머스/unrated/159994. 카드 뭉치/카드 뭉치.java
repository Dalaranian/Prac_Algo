import java.util.*;
import java.util.stream.*;

public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        Queue<String> card1Queue = arrayToQueue(cards1);
        Queue<String> card2Queue = arrayToQueue(cards2);

        for (String s : goal) {
            if (!card1Queue.isEmpty() && card1Queue.peek().equals(s)) {
                card1Queue.poll();
            } else if (!card2Queue.isEmpty() && card2Queue.peek().equals(s)) {
                card2Queue.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public Queue<String> arrayToQueue(String[] strArray) {
        return Arrays.stream(strArray)
                .collect(Collectors.toCollection(LinkedList::new));
    }
}