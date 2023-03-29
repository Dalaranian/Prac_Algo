class Solution {
    public boolean solution(int x) {
		String numStr = Integer.toString(x);
		int total = 0;
		for (char c : numStr.toCharArray()) {
			total += Character.getNumericValue(c);
		};
		return x % total == 0?true:false;
    }
}