import java.time.*;

class Solution {
    public String solution(int a, int b) {
        String[] week = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        LocalDate date = LocalDate.of(2016, a, b);

        return week[date.getDayOfWeek().getValue()];
    }
}