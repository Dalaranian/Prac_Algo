class Solution {
    public long solution(long n) {
                String origin = String.valueOf(n);
        long[] iArr = new long[origin.length()];
        
        for(int i = 0;i<=origin.length()-1;i++){
            iArr[i] = Character.getNumericValue(origin.charAt(i));
        }
        
        // iArr 를 버블 정렬
        long temp;
        for(long i = 0;i<iArr.length-1;i++) {
        	for(int j = 1;j<iArr.length-i;j++) {
        		if(iArr[j] > iArr[j-1]) {
        			temp = iArr[j-1];
        			iArr[j-1] = iArr[j];
        			iArr[j] = temp;
        		}
        	}
        }
         
        origin = "";
        for(int i = 0;i<=iArr.length-1;i++) {
        	origin += iArr[i];
        }
        
        return Long.parseLong(origin);

    }
}