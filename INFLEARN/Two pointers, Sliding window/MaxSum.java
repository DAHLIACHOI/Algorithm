package twopointers_slidingwindow;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }

        int start = 0, max_sum = 0, final_sum = 0;
        for (int j = 0; j < N; j++) {
            max_sum += arr[j];
            if (j - start >= K - 1) {
                final_sum = Math.max(max_sum, final_sum);
                max_sum -= arr[start];
                start++;
            }
        }

        System.out.println(final_sum);
    }
}

/*
* N개의 연속된 배열 가운데 K개의 연속된 합 중에서 가장 큰 값 구하기
* sliding window 알고리즘 사용
* */