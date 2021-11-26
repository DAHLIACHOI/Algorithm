package inflearn_codingTestPractice;

import java.util.*;

public class ShortestDist {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = input.next();
		char c = input.next().charAt(0);
		int[] answer = new int[str.length()];
		int dist = 101;

		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == c) dist = 0;
			answer[i] = dist;
			dist++;
		}
		
		dist = 101;
		
		for(int i = str.length()-1; i >= 0; i--) {
			char ch = str.charAt(i);
			if(ch == c) {
				dist = 0;
			}
			if(dist < answer[i]) {
				answer[i] = dist;
			}
			dist++;
		}
		
		for(int j : answer) {
			System.out.print(j + " ");
		}	
	}
}


/**
 * [inflearn �˰��� ���� Ǯ��]
 * 
 * ���� ª�� ���� �Ÿ� ���ϱ�
 * �� ���� ���ڿ�str�� ���� c�� �־����� ���ڿ� str�� �� ���ڰ� ���� c�� ������ �ּ� �Ÿ��� ����Ѵ�.
 */
