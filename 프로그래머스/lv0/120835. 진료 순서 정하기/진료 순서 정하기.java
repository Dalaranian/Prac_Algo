import java.util.Arrays;
import java.util.Collections;

class Solution {
public static int[] solution(int[] emergency){
        // emergency 의 내용을 내림차순으로 정렬할 배열 선언
        Integer[] arr = new Integer[emergency.length];
        // 배열 깊은 복사
        for(int i = 0;i<arr.length;i++){
            arr[i] = emergency[i];
        }
        // 내림차순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        int count = 1;
        // 결과 값을 저장할 배열 선언
        int result[] = new int[emergency.length];
        for(int i:convertIntArr(arr)){
            // emergency 의 값들이 내림차순 정렬된 배열을 반복하여 값을 불러오고, 해당 값에 맞는 원래 배열(emergency)의 Index 값을 불러옴
            int index = findIndex(i, emergency);
            // 불러온 Index 를 참조하여 result 배열의 해당 인덱스에 진료 우선순서를 담은 count로 초기화 
            result[index] = count;
            count++;
        }
        return result;
    }
    // arr 배열에서 num 이 위치해 있는 index 를 리턴, 없으면 -1 을 리턴
    private static int findIndex(int num, int[] arr) {
        for(int i = 0;i< arr.length;i++){
            if(num == arr[i]){
                return i;
            }
        }
        return -1;
    }
    // Integer 배열을 Int 배열로 변환해주는 매소드
    private static int[] convertIntArr(Integer[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            result[i] = arr[i];
        }
        return result;
    }
}
