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
        	System.out.println(i);
        }
        
        return null;
    }

}
