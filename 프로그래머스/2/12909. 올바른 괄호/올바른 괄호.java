import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        
        for(char x : s.toCharArray()) {
            if (x == '(') st.push(x);
            else {
                if (st.isEmpty()) return false;
                st.pop();
            }
        }
        
        if (!st.isEmpty()) return false;

        return answer;
    }
}