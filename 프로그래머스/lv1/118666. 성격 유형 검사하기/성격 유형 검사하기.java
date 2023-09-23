import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> surveyResult = new HashMap<>();

        for (int i = 0; i <= survey.length - 1; i++) {
            char[] currentSurvey = survey[i].toCharArray();
            int currentChoice = choices[i];

            if (currentChoice >= 5) {
                if (!surveyResult.containsKey(currentSurvey[1])) {
                    surveyResult.put(currentSurvey[1], currentChoice - 4);
                } else {
                    surveyResult.put(currentSurvey[1], surveyResult.get(currentSurvey[1]) + currentChoice - 4);
                }
            } else if (currentChoice <= 3) {
                int point = switch (currentChoice) {
                    case 1 -> 3;
                    case 2 -> 2;
                    case 3 -> 1;
                    default -> 0;
                };
                if (!surveyResult.containsKey(currentSurvey[0])) {
                    surveyResult.put(currentSurvey[0], point);
                }else{
                    surveyResult.put(currentSurvey[0], surveyResult.get(currentSurvey[0]) + point);
                }
            }
        }

        char[][] indicatorIndex = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        StringBuilder answer = new StringBuilder();

        for (char[] currentIndex : indicatorIndex) {
            int indicator1 = surveyResult.getOrDefault(currentIndex[0], 0);
            int indicator2 = surveyResult.getOrDefault(currentIndex[1], 0);

            if(indicator1 > indicator2){
                answer.append(currentIndex[0]);
            }else if(indicator1 < indicator2){
                answer.append(currentIndex[1]);
            }else{
                answer.append((char) Math.min(currentIndex[0], currentIndex[1]));
            }
        }

        return answer.toString();
    }
}