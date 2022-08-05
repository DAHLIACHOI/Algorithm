package twopointers_slidingwindow;

import java.util.Scanner;

public class CountingSum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int answer = 0, cnt = 1;
        N--;
        while (N > 0) {
            cnt++;
            N = N - cnt;
            if(N % cnt == 0) answer++;
        }

        System.out.println(answer);
    }
}
