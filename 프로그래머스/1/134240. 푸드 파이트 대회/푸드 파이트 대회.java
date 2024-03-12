class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        
        // 왼쪽 정렬 추가
        for (int i = 1; i < food.length; i++) {
            
            int cnt = food[i] / 2; // 원소 짝수 판별
            
            for(int j = 0; j < cnt; j++) {
                answer += Integer.toString(i);
            }
        }
        
        
        // 물 추가
        answer += "0";
        
        // 오른쪽 정렬 추가
        for(int i = answer.length() - 2; i >= 0; i--) {
            answer += answer.charAt(i);
        }
        
        return answer;
    }
}