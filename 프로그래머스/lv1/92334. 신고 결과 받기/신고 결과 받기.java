import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, HashSet<String>> reportMap = getReportMap(id_list);
        Map<String, Integer> index = getIndex(id_list);

        for (String s : report) {
            String[] currentReport = s.split(" ");
            reportMap.get(currentReport[1]).add(currentReport[0]);
        }

        int[] result = new int[id_list.length];
        for (String s : reportMap.keySet()) {
            HashSet<String> currentReportMember = reportMap.get(s);
            if(currentReportMember.size() >= k){
                for (String reportMember : currentReportMember) {
                    result[index.get(reportMember)]++;
                }
            }
        }

        return result;
    }

    private Map<String, Integer> getIndex(String[] idList) {
        int currentIndex = 0;
        Map<String, Integer> result = new HashMap<>();
        for (String s : idList) {
            result.put(s, currentIndex);
            currentIndex++;
        }
        return result;
    }

    private HashMap<String, HashSet<String>> getReportMap(String[] idList) {
        HashMap<String, HashSet<String>> result = new HashMap<>();
        for (String key : idList) {
            result.put(key, new HashSet<>());
        }
        return result;
    }
}