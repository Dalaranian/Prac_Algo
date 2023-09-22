import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate currentDate = LocalDate.parse(today, formatter);
        HashMap<String, Integer> termsMap = getTermsMaps(terms);

        List<Integer> result = new ArrayList<>();
        int index = 1;
        for (String privacy : privacies) {
            String[] currentPrivacy = privacy.split(" ");
            LocalDate endDate = LocalDate.parse(currentPrivacy[0], formatter).plusMonths(termsMap.get(currentPrivacy[1])).minusDays(1);
            if(endDate.isBefore(currentDate)){
                result.add(index);
            }
            index++;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private HashMap<String, Integer> getTermsMaps(String[] terms) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String term : terms) {
            String[] currentTerm = term.split(" ");
            result.put(currentTerm[0], Integer.parseInt(currentTerm[1]));
        }
        
       return result;
    }
}
