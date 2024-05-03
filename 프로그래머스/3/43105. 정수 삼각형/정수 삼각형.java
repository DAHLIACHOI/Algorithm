import java.util.*;
class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int m = triangle[n - 1].length;
        
        int[][] board = new int[n][m];
        
        for (int i = 0; i < m; i++) {
            board[n -1][i] = triangle[n -1][i];
        }
        
        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j < triangle[i].length; j++) {
                board[i][j] = triangle[i][j] + Math.max(board[i + 1][j], board[i + 1][j + 1]);
            }
        }
        
        return board[0][0];
    }
}