package array;

import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        MaxSum T = new MaxSum();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] arr= new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int rowMax = Collections.max(T.rowSum(arr, N));
        int colMax = Collections.max(T.colSum(arr, N));
        int diaMax = Collections.max(T.diaSum(arr, N));

        System.out.println(Math.max(Math.max(rowMax, colMax), diaMax));

    }

    // row 합 arrayList
    public ArrayList<Integer> rowSum(int arr[][], int N){
        ArrayList<Integer> rowArr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += arr[i][j];
            }
            rowArr.add(rowSum);
        }
        return rowArr;
    }

    // col 합 arrayList
    public ArrayList<Integer> colSum(int arr[][], int N) {
        ArrayList<Integer> colArr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                colSum += arr[j][i];
            }
            colArr.add(colSum);
        }
        return colArr;
    }

    // dia 합 arrayList
    public ArrayList<Integer> diaSum(int arr[][], int N) {
        ArrayList<Integer> diaArr = new ArrayList<>();
        int diaSum = 0;
        for(int i = 0; i < N; i++){
            diaSum += arr[i][i];
        }
        diaArr.add(diaSum);
        diaSum = 0;

        for (int i = 0; i < N; i++) {
            diaSum += arr[i][N-i-1];
        }
        diaArr.add(diaSum);
        return diaArr;
    }
}

/*
* [inflearn 알고리즘 문제 풀이]
* N*N 격자판에서 가로, 세로, 대각선의 합 중 가장 큰 값 구하기
* */