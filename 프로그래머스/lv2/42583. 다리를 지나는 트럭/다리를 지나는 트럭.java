import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;

        // System.out.println("bridgeWeight is " + weight);
        // System.out.println("=========================");

        for (int nextTruck : truck_weights) {
            // System.out.println("currentTruckWeight is \t" + nextTruck);
            // System.out.println("currentBridgeWeight is \t" + sumQueue(bridge));
            // System.out.println("start time is \t\t\t" + time);
            // 다리에 트럭이 한대도 없을 때,
            while (true) {
                if (bridge.isEmpty()) {
                    // 다리에 트럭을 올리고, 시간을 가산
                    bridge.add(nextTruck);
                    time++;
                    // 다음 트럭 불러오기
                    break;
                }
                // 다리가 가득 차지 않을 떄,
                else if(bridge.size() < bridge_length) {
                    // 지금 시점에서 다리에 있는 트럭의 총 중량을 계산
                    int currentTotal = sumQueue(bridge);

                    // 총 중량 + 들어올 트럭이 weight 보다 작으면, 트럭을 전진
                    if(currentTotal + nextTruck <= weight) {
                        bridge.add(nextTruck);
                        time++;
                        break;
                    }else {
                        // 넘을경우, 큐에 0을 넣어서 트럭을 전진
                        bridge.add(0);
                        time++;
                    }
                }else if(bridge.size() == bridge_length){
                    bridge.poll();
                }
                // System.out.println("CurrentTime is \t\t\t" + time);
                // System.out.println(bridge);
                // System.out.println("=========================");
            }
        }

        return time + bridge_length;
    }

    private int sumQueue(Queue<Integer> queue) {
        return queue.stream().mapToInt(Integer::intValue).sum();
    }
}