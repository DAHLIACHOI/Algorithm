package twopointers_slidingwindow;

import java.util.*;

public class CombineArrays{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr1 = new int[N];

        for(int i = 0; i < N; i++){
            arr1[i] = input.nextInt();
        }

        int M = input.nextInt();
        int[] arr2 = new int[M];
        int[] answer = new int[N + M];

        for (int j = 0; j < M; j++) {
            arr2[j] = input.nextInt();
        }

        System.arraycopy(arr1, 0, answer, 0, N);
        System.arraycopy(arr2, 0, answer, N, M);
        Arrays.sort(answer);

        for(int num : answer){
            System.out.print(num + " ");
        }

    }

}

/*
* [inflearn 알고리즘 문제 풀이]
* 오름차순으로 정렬된 크기가 N,M인 배열 2개를 합친 배열을 만들고 오름차순으로 정렬하기
* */