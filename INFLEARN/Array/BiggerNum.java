package array;

import java.util.*;

public class BiggerNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N];
		int max = 0;
		String answer = "";
		
		for(int i=0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(max < arr[i]) {
				answer += arr[i] + " ";
				
			}
			max = arr[i];
		}
		System.out.println(answer);
	}
}

/*
 * [inflearn �˰��� ���� Ǯ��]
 * �� ������ ū ���� �� �ٷ� ����Ѵ�.
 * */
