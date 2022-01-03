package inflearn_codingTestPractice;

import java.util.*;

public class CompressStr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		str += " ";
		int standard = 0;
		char tmp = str.charAt(0);
		String answer = "";
		char[] arr = str.toCharArray();
		
		for(int i = 1; i < str.length(); i++) {
			if(tmp != str.charAt(i)) {
				answer += arr[standard];
				if(i - standard > 1) answer += i-standard;
				tmp = str.charAt(i);
				standard = i;
			}
		}
		System.out.println(answer.toString());		
	}
}

/*
 * [inflearn 알고리즘 문제 풀이]
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 무자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하기. 단, 반복횟수가 1인경우는 생략
 * */
