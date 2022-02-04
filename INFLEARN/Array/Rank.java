package array;

import java.util.*;

public class Rank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < N; i++){
            int rank = 1;
            for(int j = 0; j < N; j++){
                if(arr[i] < arr[j]) rank++;
            }
            answer[i] = rank;
        }

        for(int num : answer){
            System.out.print(num + " ");
        }
    }
}

/*
* [inflearn 알고리즘 문제 풀이]
* 등수 구하기*/
