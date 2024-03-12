import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        int answer = 0;
        int length = friends.length;
        
        HashMap<String, Integer> index = new HashMap<>();
        int[] gift_num = new int[length];
        int[][] gift_relationship = new int[length][length];
        
        // 순서 결정
        for (int i = 0; i < length; i++) {
            index.put(friends[i], i);
        }
        
        for (String gift : gifts) {
            String[] relation = gift.split(" ");
            String sender = relation[0]; // 선물을 준 사람
            String receiver = relation[1]; // 선물을 받은 사람
            
            gift_num[index.get(sender)] ++;
            gift_num[index.get(receiver)] --;
            gift_relationship[index.get(sender)][index.get(receiver)] ++;
        }
        
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (i == j) continue;
                
                if (gift_relationship[i][j] > gift_relationship[j][i] 
                    || (gift_relationship[i][j] == gift_relationship[j][i] && gift_num[i] > gift_num[j])) {
                    count ++;
                }
            }
            if (answer < count) {
                answer = count;
            }
            
        }
        
        return answer;
        
    }
}