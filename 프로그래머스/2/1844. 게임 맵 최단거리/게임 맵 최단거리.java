import java.util.*;
class Point {
    int x;
    int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[][] dis;
    static int n, m;
    
    public void bfs(int x, int y, int[][] maps) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        maps[x][y] = 0;
        dis = new int[n][m];
        
        while(!Q.isEmpty()) {
            Point p = Q.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                
                if (0 <= nx && nx < n && 0 <= ny && ny < m && maps[nx][ny] == 1) {
                    Q.offer(new Point(nx, ny));
                    maps[nx][ny] = 0;
                    dis[nx][ny] = dis[p.x][p.y] + 1;
                }
            }
        }
        
    }
    
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        
        bfs(0, 0, maps);
        
        if(dis[n - 1][m - 1] == 0) return -1;
        return dis[n - 1][m - 1] + 1;
    }
}