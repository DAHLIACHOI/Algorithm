package array;
import java.util.*;

public class ClassPresident {
    public static void main(String[] args) {
        ClassPresident T = new ClassPresident();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] arr = new int[N+1][6];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < 6; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println(T.classPresidentAnswer(arr, N));
    }

    public int classPresidentAnswer(int[][] arr, int N) {

        int answer=0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= 5; k++) {
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
                answer = i;
            }
        }

        return answer;

    }
}

/*
* [inflearn 알고리즘 문제 풀이]
* 한 번이라도 같은 반을 해본 학생 중에 가장 많은 학생이 임시 반장이 된다.
* (처음에 이해를 잘못해서 한 명이 여러번 같은 반 했던것도 count를 했었는데 강사님 강의를 다시 보고 이해한 다음에 다시 풀었다.)
* */