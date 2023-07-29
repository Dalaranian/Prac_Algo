import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Solution {

    int basicTime;
    int basicFee;
    int extraTime;
    int extraFee;

    public int[] solution(int[] fees, String[] records) {
        // 가격을 등록
        basicTime = fees[0];
        basicFee = fees[1];
        extraTime = fees[2];
        extraFee = fees[3];

        // 자동차 별 누적 주차 시간
        HashMap<String, Integer> carFees = new HashMap<>();
        // 가상의 주차장
        Map<String, LocalTime> parkingLot = new HashMap<>();

        for (String record : records) {
            String[] tuple = record.split(" ");

            if (tuple[2].equals("IN")) {
                parkingLot.put(tuple[1], LocalTime.parse(tuple[0]));
            } else {
                // 입차 시간과, 출차 시간의 간격 구하기
//                Duration duration = Duration.between(parkingLot.get(tuple[1]), LocalTime.parse(tuple[0]));
                long durationMinute = ChronoUnit.MINUTES.between(parkingLot.get(tuple[1]), LocalTime.parse(tuple[0]));

                // 주차시간에 저장
                carFees.put(tuple[1], carFees.getOrDefault(tuple[1], 0) + Long.valueOf(durationMinute).intValue());

                // 간격 구한 차 출차하기
                parkingLot.remove(tuple[1]);
            }
        }

        // 하루종일 안나간 차량에 대한 처리
        LocalTime end = LocalTime.of(23, 59);

        for (Map.Entry<String, LocalTime> leftCar : parkingLot.entrySet()) {
            long durationMinute = ChronoUnit.MINUTES.between(leftCar.getValue(), end);
            carFees.put(leftCar.getKey(), Long.valueOf(durationMinute).intValue() + carFees.getOrDefault(leftCar.getKey(), 0));
        }

        // 자동차번호 오름차순으로 정렬
        List<String> sortedCarNum = new ArrayList<>(carFees.keySet());
        Collections.sort(sortedCarNum, (a, b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));

        int[] answer = new int[sortedCarNum.size()];

        for (int i = 0; i < sortedCarNum.size(); i++) {
            int cumulativeTime = carFees.get(sortedCarNum.get(i));
            if (cumulativeTime > basicTime) {
                // 기본시간을 뺀 남은 시간이 나누어 떨어질 때,
                if((cumulativeTime - basicTime) % extraTime == 0){
                    answer[i] = basicFee + (((cumulativeTime - basicTime)/extraTime) * extraFee);
                }
                // 나누어 떨어지지 않을 때,
                else {
                    while((cumulativeTime - basicTime) % extraTime != 0){
                        cumulativeTime++;
                    }
                    answer[i] = basicFee + (((cumulativeTime - basicTime)/extraTime) * extraFee);
                }
            //기본 시간을 넘지 않았을 때,
            } else if(cumulativeTime <= basicTime){
                answer[i] = basicFee;
            }
        }

        return answer;
    }
}