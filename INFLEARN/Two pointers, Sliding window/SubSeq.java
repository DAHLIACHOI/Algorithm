package twopointers_slidingwindow;

import java.util.Scanner;

public class SubSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0, start = 0, answer = 0;

        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if(sum == M) answer++;
            while (sum >= M) {
                sum -= arr[start++];
                if(sum == M) answer++;
            }
        }
        System.out.println(answer);
    }
}

/*
* 연속 부분 수열구하기
* N개의 정수를 입력하고, 연속된 수의 합이 M이 되는 개수를 구한다.
* */