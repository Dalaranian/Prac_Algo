import java.util.ArrayList;
import java.util.List;

class Solution {
    private boolean[][] isVisited;
    private int[][] parsedMap;

    public int[] solution(String[] maps) {
        int[] answer = {};

        // 파라미터로 넘어온 문자열 배열을, Int 배열로 변환
        parsedMap = new int[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            char[] currentStr = maps[i].toCharArray();
            for (int j = 0; j < maps[i].length(); j++) {
                if (currentStr[j] != 88) {
                    parsedMap[i][j] = Character.getNumericValue(currentStr[j]);
                } else {
                    parsedMap[i][j] = 0;
                }
            }
        }

        // 누적합을 담을 List 선언
        List<Integer> result = new ArrayList<>();

        // 방문한 곳을 기록하는 불린 배열 선언
        isVisited = new boolean[parsedMap.length][parsedMap[0].length];
        for (int i = 0; i < isVisited.length; i++) {
            for (int j = 0; j < isVisited[i].length; j++) {
                if (parsedMap[i][j] == 0) {
                    isVisited[i][j] = true;
                }
            }
        }

        for (int i = 0; i < parsedMap.length; i++) {
            for (int j = 0; j < parsedMap[i].length; j++) {
                int sum = doSearch(i, j);
                result.add(sum);
            }
        }

        // 무인도가 없는경우
        if (result.stream().mapToInt(Integer::intValue).sum() <= 0) {
            return new int[]{-1};
        }

        // 무인도가 있을 경우, 정렬하여 Int 배열로 변환 후 리턴
        return result.stream()
                .filter(value -> value != 0) // 0이 아닌 값들만
                .sorted() // 오름차순으로 정렬
                .mapToInt(Integer::intValue) // Integer 를 int 로 변환하여
                .toArray(); // 배열로
    }

    /**
     * DFS 알고리즘 구현
     */
    private int doSearch(int i, int j) {
        // DFS 종료조건 1. 탐색 범위가 벗어남
        if (i < 0 || j < 0 || i >= parsedMap.length || j >= parsedMap[0].length) {
            return 0;
        }
        // DFS 종료조건 2. 이미 탐색한 노드
        if (isVisited[i][j]) {
            return 0;
        }

        int currentSum = parsedMap[i][j];
        isVisited[i][j] = true;

        // 상하좌우로 탐색
        return currentSum
                + doSearch(i + 1, j) // 상
                + doSearch(i - 1, j) // 하
                + doSearch(i, j - 1) // 좌
                + doSearch(i, j + 1); // 우
    }

}