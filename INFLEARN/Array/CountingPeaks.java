package array;
import java.util.*;

public class CountingPeaks {
    public static void main(String[] args) {
        CountingPeaks T = new CountingPeaks();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] arr = new int[N + 2][N + 2];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                arr[i][j] = input.nextInt(); //격자판에 숫자 채워넣기
            }
        }

        System.out.println(T.peakAnswer(arr, N));

    }

    public int peakAnswer(int[][] arr, int N) {
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++){
                int num = arr[i][j];
                if(num > arr[i-1][j] &&
                        num > arr[i+1][j] &&
                        num > arr[i][j-1] &&
                        num > arr[i][j+1])
                    cnt++;
            }
        }
        return cnt;
    }
}

/*
* [inflearn 알고리즘 문제 풀이]
* N*N 격자판에서 상하좌우 보다 높은 수를 봉우리라고 설정. 봉우리의 개수 구하기
* */