package array;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] fArr = new int[N];
		fArr[0] = 1;
		fArr[1] = 1;
		
		for(int i = 0 ; i < N-2; i++) {
			fArr[i+2] = fArr[i] + fArr[i+1];
		}

		for(int num : fArr) {
			System.out.print(num + " ");
		}
	}
}

/*
 * [inflearn 알고리즘 문제 풀이]
 * 피보나치 수열
 */