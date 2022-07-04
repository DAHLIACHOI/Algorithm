package twopointers_slidingwindow;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr1 = new int[N];

        for(int i = 0; i < N; i++){
            arr1[i] = input.nextInt();
        }

        int M = input.nextInt();
        int[] arr2 = new int[M];
        ArrayList<Integer> answer = new ArrayList<>();

        for (int j = 0; j < M; j++) {
            arr2[j] = input.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        while(p1 < N && p2 < M){
            if(arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            }
            else if(arr1[p1] < arr2[p2]) p1++;
            else p2++;

        }

        for(int num : answer){
            System.out.print(num + " ");
        }

    }
}
