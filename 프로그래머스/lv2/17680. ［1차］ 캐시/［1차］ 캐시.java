import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int cacheSize, String[] cities) {
        int executeTime = 0;

        // 캐시 사이즈가 0일경우의 heuristic
        if(cacheSize <= 0){
            return cities.length * 5;
        }

        // 도시 이름과, 마지막 실행시간을 저장함
        HashMap<String, Integer> cacheMem = new HashMap<>();
        for (String rowCity : cities) {

            String city = rowCity.toLowerCase();

            // System.out.println(city + " 호출");
            // 캐시 적중했을 경우
            if (cacheMem.containsKey(city)) {
                // System.out.println("적중됨");
                // 실행시간 1 증가
                executeTime += 1;
                // 적중했으므로, 마지막 실행시간 업데이트
                cacheMem.put(city, executeTime);
            }
            // 적중되지 않았을 떄
            else {
                executeTime += 5;
                // System.out.println("적중되지 않음");
                // 캐시 메모리 여유공간이 있을 때,
                if (cacheMem.size() < cacheSize) {
                    // 캐시에 적제후, 실행시간 업데이트
                    cacheMem.put(city, executeTime);
                }
                // 여유공간이 없을 떄, LRU 교체
                else {
                    // System.out.println("여유공간 없음, 페이지 교체 알고리즘 실행");

                    LRU(executeTime, cacheMem, city);
                }
            }
            // System.out.println("이번 사이클 캐시 : " + cacheMem);
        }

        return executeTime;
    }

    private static void LRU(int executeTime, HashMap<String, Integer> cacheMem, String city) {
        // 가장 마지막에 호출된 친구 찾기
        String minKey = null;
        int minValue = Integer.MAX_VALUE;

        // 해시맵 순회
        for (Map.Entry<String, Integer> entry : cacheMem.entrySet()) {
            int value = entry.getValue();

            // 가장 작은 값을 가진 요소를 찾음
            if (value < minValue) {
                minValue = value;
                minKey = entry.getKey();
            }
        }

        // 가장 작은 값을 가진 요소를 제거
        if (minKey != null) {
            // System.out.println("가장 작은 친구 제거 " + minKey);
            cacheMem.remove(minKey);
        }

        // 제거 후 현재 값 넣기
        cacheMem.put(city, executeTime);
    }
}
