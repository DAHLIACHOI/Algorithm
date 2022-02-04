package array;

import java.util.*;

public class OxQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        int tmp=0; int score=1; int total=0;

        for(int i = 0; i < N; i++){
            arr[i] = input.nextInt();
        }

        for(int j =0; j < N; j++){
            if(arr[j] == 1){
                if(tmp == 1) score++; // 그 전에 맞춘 경우 score에서 1추가
                total += score;
                tmp = 1;
            }
            else{
                score=1;
                tmp = 0;
            }
        }
        System.out.println(total);
    }
}

/*
* [inflearn 알고리즘 문제 풀이]
* ox퀴즈, 기본 1점을 주고 연속으로 맞추면 가산점1점씩 추가
* 정답은 1, 오답은 0 으로 표기*/