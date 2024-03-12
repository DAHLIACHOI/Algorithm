class Solution {
    public String solution(int[] food) {
        
        StringBuffer sb = new StringBuffer();
        
        // 왼쪽 정렬 추가
        for (int i = 1; i < food.length; i++) {
            
            for(int j = 0; j < food[i] / 2; j++) {
                sb.append(Integer.toString(i));
            }
        }
        
        String left = sb + "0";
        
        // 오른쪽 추가
        String answer = left + sb.reverse();

        return answer;
    }
}