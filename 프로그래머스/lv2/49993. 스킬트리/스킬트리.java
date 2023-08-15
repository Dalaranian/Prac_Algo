import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String skillTree : skill_trees) {
            if(isPossible(skill, skillTree)){
                answer++;
            }
        }
        return answer;
    }

    private boolean isPossible(String skill, String skillTree) {
        Queue<Character> skillQueue = makeQueue(skill);
        for (char c : skillTree.toCharArray()) {
            if(skillQueue.isEmpty()){
                return true;
            }
            if (skillQueue.peek() == c){
                skillQueue.poll();
            } else if (skill.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    private Queue<Character> makeQueue(String skill) {
        Queue<Character> result = new LinkedList<>();
        for (char c : skill.toCharArray()) {
            result.add(c);
        }
        return result;
    }
}