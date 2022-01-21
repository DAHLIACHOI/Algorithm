package array;

import java.util.*;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N+1];
		int cnt = 0;
		
		for(int i=2; i <= N; i++) {
			if(arr[i] == 0) {
				cnt++;
				for(int j = i; j <= N; j+=i) {
					arr[j] = 1;
				}
			}
		}
		System.out.println(cnt);
	}
}

/*
 * [inflearn 알고리즘 문제 풀이]
 * 소수판별
 * */
 */