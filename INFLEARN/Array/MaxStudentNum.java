package array;

import java.util.*;

public class MaxStudentNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N];
		int cnt = 0;
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		for(int height : arr) {
			if(max < height) {
				cnt++;
				max = height;
			}
		}
		System.out.println(cnt);
	}
}

/*
 * [inflearn �˰��� ���� Ǯ��]
 * �Ϸķ� �� �л��� �߿� �� ���� �տ��� ���̴��� ���� ����Ѵ�.
 * */
