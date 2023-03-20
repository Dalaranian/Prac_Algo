import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
    		Stack<Character> st = new Stack<>();
		
		if(s.equals("")) {
			return 0;
		}
		
		st.push(s.charAt(0));
		
		
		for(int i = 1;i<s.length();i++) {
			if( !st.isEmpty() && st.peek()==s.charAt(i)  ) {
				st.pop();
			}else {
				st.push(s.charAt(i));
			}
		}

		return st.isEmpty()?1:0;
    }
}