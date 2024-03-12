import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int length = commands.length;
        int[] answer = new int[length];
                
        for (int i = 0; i < length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];
            
            List<Integer> numbers = new ArrayList<>();

            for(int j = start-1; j < end; j++) {
                numbers.add(array[j]);
            }
            
            // 리스트 정렬
            Collections.sort(numbers);
            
            // answer에 추가
            answer[i] = numbers.get(k-1);
        }
        
        return answer;
    }
}