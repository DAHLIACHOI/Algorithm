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
 * [inflearn 알고리즘 문제 풀이]
 * 
 * 가장 짧은 문자 거리 구하기
 * 한 개의 문자열str과 문자 c가 주어지면 문자열 str의 각 문자가 문자 c와 떨어진 최소 거리를 출력한다.
 */
