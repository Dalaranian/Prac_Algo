import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
    Map<String, Integer> playerIndices = new HashMap<>();

    // 플레이어 배열을 순회하며 각 플레이어와 인덱스를 맵에 저장합니다.
    for (int i = 0; i < players.length; i++) {
        playerIndices.put(players[i], i);
    }

    for (String call : callings) {
        // 호출(call)을 찾아서 인덱스를 가져옵니다.
        Integer index = playerIndices.get(call);
        if (index != null) {
            if (index > 0) {
                // 해당 플레이어를 호출하는 위치로 이동시킵니다.
                String pre = players[index - 1];
                players[index - 1] = call;
                players[index] = pre;
                // 인덱스를 업데이트합니다.
                playerIndices.put(call, index - 1);
                playerIndices.put(pre, index);
            }
        }
    }

    return players;
    }
}