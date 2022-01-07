package array;

import java.util.*;

public class RockScissorPaper {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arrA = new int[N];
		int[] arrB = new int[N];
		
		
		for(int i = 0; i < N; i++) {
			arrA[i] = input.nextInt();
		}
		
		for(int j = 0; j < N; j++) {
			arrB[j] = input.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if (arrA[i] == arrB[i]) System.out.println("D");
			else if(arrA[i] == 1 && arrB[i] == 3) System.out.println("A");
			else if(arrA[i] == 2 && arrB[i] == 1) System.out.println("A");
			else if(arrA[i] == 3 && arrB[i] == 2) System.out.println("A");
			else System.out.println("B");
		}
	}
}

/*
 * [inflearn �˰��� ���� Ǯ��]
 * 1: ����, 2: ����, 3: ���� ���ϰ� ����� ���� D���, A�� �̰��� ���� A���, B�� �̰��� ���� B���*/
