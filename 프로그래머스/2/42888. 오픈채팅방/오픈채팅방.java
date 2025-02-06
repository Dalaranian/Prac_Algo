import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] record) {
        // 최종 유저 닉네임 계산
        Map<String, String> userInfo = Arrays.stream(record)
                .map(row -> row.split(" "))
                .filter(row -> !row[0].equals("Leave")) // 떠나는 것은 닉네임 변경과 연관 없음
                .collect(Collectors.toMap(
                        row -> row[1], // UID
                        row -> row[2], // Nickname
                        (oldKey, newKey) -> newKey
                ));

        // 로그 메세지 생성 후 반환
        return Arrays.stream(record)
                .map(row -> row.split(" "))
                .filter(row -> !row[0].equals("Change"))
                .map(row -> {
                    return userInfo.get(row[1]) + (row[0].equals("Enter") ?  "님이 들어왔습니다." : "님이 나갔습니다.");
                })
                .toArray(String[]::new);
    }
}