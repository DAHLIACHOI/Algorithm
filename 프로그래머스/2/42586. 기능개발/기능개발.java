import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();
        
        Queue<Integer> daysQ = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i])%speeds[i] == 0)
                daysQ.offer((100 - progresses[i])/speeds[i]);
            else
                daysQ.offer((100 - progresses[i])/speeds[i] + 1);
        }
        
        int tmp = daysQ.poll();
        int cnt = 1;
            
        while(!daysQ.isEmpty()) {
            
            int tmp2 = daysQ.poll();
            if(tmp >= tmp2) cnt++;
            else {
                tmp = tmp2;
                answer.add(cnt);
                cnt = 1;
            }
        }
        answer.add(cnt);
        
        return answer;
    }
}