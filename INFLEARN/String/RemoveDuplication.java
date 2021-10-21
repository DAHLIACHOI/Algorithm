package inflearn_codingTestPractice;

import java.util.*;

public class RemoveDuplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String answer = "";
		
		for(int i =0; i < str.length(); i++) {
			if( i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		System.out.println(answer);
	}
}


/*
 * [ inflearn 알고리즘 문제 풀이 ]
 * 
 * 중복된 문자 제거하기
 * ( 반복문을 돌려서 i와 그 i번째의 charAt의 숫자가 같으면 답안으로 남긴다.
 *   만약 중복된 문자일 경우에는 charAt이 가장 먼저 나온 문자의 순서로 나오기 때문에 i와 같을 수가 없다.)
 */