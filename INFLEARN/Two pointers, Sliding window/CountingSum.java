package twopointers_slidingwindow;

import java.util.Scanner;

public class CountingSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        int sum = 0, start = 0, answer = 0;
        for (int j = 0; j < N-1; j++) {
            sum += arr[j];
            if(sum == N) answer++;
            while (sum >= N) {
                sum -= arr[start++];
                if(sum == N) answer++;
            }
        }

        System.out.println(answer);
    }
}

/*
* [inflearn 알고리즘]
* 연속된 자연수의 합
* */