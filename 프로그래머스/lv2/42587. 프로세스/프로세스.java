import java.util.LinkedList;
import java.util.Queue;


class Solution {
    class Process {
        int location;
        int priority;

        /**
         * @param location 프로세스 위치
         * @param priority 프로세스 우선순위
         */
        public Process(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "Process [location=" + location + ", priority=" + priority + "]";
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + location;
            result = prime * result + priority;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Process other = (Process) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (location != other.location)
                return false;
            if (priority != other.priority)
                return false;
            return true;
        }

        public int getLocation() {
            return location;
        }

        public int getPriority() {
            return priority;
        }

        public void setLocation(int location) {
            this.location = location;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        private Solution getEnclosingInstance() {
            return Solution.this;
        }

    }

    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Process> queue = new LinkedList<>();

        for (int i = 0; i <= priorities.length - 1; i++) {
            queue.add(new Process(i, priorities[i]));
        }

        // System.out.println(queue);

        while (!queue.isEmpty()) {
            Process currentProcess = queue.poll(); // 큐에서 작업을 하나씩 꺼내오기
            boolean isPriority = true; // 꺼내온 작업이 일단 가장 높은 순위라 가정
            for(Process process:queue){
                if(currentProcess.getPriority() < process.getPriority()){
                    isPriority = false; // 가장 높은 순위가 아니므로 False
                    break;
                }
            }
            // 가장 높은 순위일시
            if(isPriority){
                // 실행하기
                answer++;
                // 원하는 location에 해당하는 프로세스인지 확인
                if(currentProcess.getLocation() == location){
                    break;
                }
            }else{
                // 우선순위가 높은 친구가 있으므로, 큐의 끝에 다시 넣어주기
                queue.add(currentProcess);
            }
        }

        return answer;
    }
}