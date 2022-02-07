package array;

import java.util.*;
public class Mentoring {
    public static void main(String[] args) {
        Mentoring T = new Mentoring();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println(T.mentoringAnswer(n,m,arr));
    }
    public int mentoringAnswer(int n, int m, int[][] arr){
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++){
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi=0, pj=0;
                    for (int s = 0; s < n; s++) {
                        if(arr[k][s] == i) pi = s;
                        if(arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) answer++;
            }
        }

        return answer;
    }
}

/*[inflearn 알고리즘 문제 풀이]
* 모든 테스트에서 등수가 앞선 학생이 멘토, 더 낮은 학생이 멘티로 지정될 수 있는 경우의 수 구하기
* */