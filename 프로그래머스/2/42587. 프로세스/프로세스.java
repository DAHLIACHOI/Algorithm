import java.util.*;

class Process {
    int priority;
    int location;
    
    public Process(int location, int priority) {
        this.location = location;
        this.priority = priority;
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<Process> processQ = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            processQ.offer(new Process(i, priorities[i]));
        }
        
        Arrays.sort(priorities);
        int cnt = 1;
        int pLocation = priorities.length;
        
        while(true) {
            Process process = processQ.poll();

            if (process.priority < priorities[pLocation - 1]) {
                processQ.offer(process);
            } else {
                if (process.location == location) {
                    return cnt;
                }
                cnt++;
                pLocation--;
            }
        }
    }
}