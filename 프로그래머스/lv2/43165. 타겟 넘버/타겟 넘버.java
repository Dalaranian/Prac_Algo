import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(0, 0));

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.index == numbers.length) {
                if (node.sum == target) {
                    answer++;
                }
                continue;
            }

            stack.push(new Node(node.index + 1, node.sum + numbers[node.index]));
            stack.push(new Node(node.index + 1, node.sum - numbers[node.index]));
        }

        return answer;
    }

    class Node {
        int index;
        int sum;

        Node(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }
    }
}