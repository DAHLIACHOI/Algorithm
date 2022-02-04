package array;

import java.util.*;

public class ReversePrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            String str = new StringBuffer(input.next()).reverse().toString();
            arr[i] = Integer.valueOf(str);
        }

        for(int j = 0; j < N; j++){
            if(isPrime(arr[j]))
                System.out.print(arr[j] + " ");

        }
    }

    public static boolean isPrime(int num){
        if (num == 1) return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}

/*
* [inflearn 알고리즘 풀이]
* 입력받은 숫자를 반대로 뒤집어서 소수인 숫자만 출력하기*/