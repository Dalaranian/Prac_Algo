import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 76, 24};
		solution(arr);

	}
	
    public static int[] solution(int[] emergency) {
    	int[] arr = emergency.clone();
    	Arrays.sort(arr);
    	for(int i:arr) {
    		int index = GetIndex(i, emergency);
    		System.out.println(index);
    	}
        return null;
    }

	private static int GetIndex(int i, int[] arr) {
		// TODO Auto-generated method stub
		for(int index = 0;i<arr.length;i++) {
			System.out.println(i + " " + index);
			if(i == arr[index]) {
				return index + 1;
			}
		}
		return 0;
	}

}
