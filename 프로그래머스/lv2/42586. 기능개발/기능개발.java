import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> taskQueue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0;i<=progresses.length-1;i++){
            // 남은 일 계산
            int leftDays = (100 - progresses[i]) / speeds[i];
            // 안 나누어떨어질경우, 하루 추가
            if((100 - progresses[i]) % speeds[i] != 0){
                leftDays++;
            }

            taskQueue.add(leftDays);
        }

        System.out.println("남은 작업일수 : " + taskQueue);

        int currentTask = taskQueue.poll();

        int releaseFunc = 1;

        System.out.println("---------------------------");
        while(!taskQueue.isEmpty()){

            int leftDays = taskQueue.peek();

            System.out.println("CurrentTask is : " + currentTask);
            System.out.println("LeftDays is : " + leftDays);
            // Queue 에서 Pop 한 작업이, 지금 작업보다 더 빨리 끝날 경우
            if(currentTask >= leftDays){
                // 릴리즈할 기능에 추가
                releaseFunc++;
                taskQueue.poll();
                System.out.println("releaseFunc added : " + releaseFunc);
            }
            // Queue 에서 Pop 한 작업이, 지금 작업보다 더 늦게 끝날 경우
            else if(currentTask < leftDays){
                answerList.add(releaseFunc);
                System.out.println("answerList added : " + answerList);
                releaseFunc = 0;
                currentTask = leftDays;
            }
            System.out.println("---------------------------");
        }
        // 마지막에 남아있는 릴리즈 기능 추가하기
        answerList.add(releaseFunc);
        System.out.println("Final Result = " + answerList);

        int[] result = answerList.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}