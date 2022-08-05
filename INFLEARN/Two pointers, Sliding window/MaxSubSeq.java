package twopointers_slidingwindow;

import java.util.Scanner;

public class MaxSubSeq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < N; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > K){
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        System.out.println(answer);
    }
}
