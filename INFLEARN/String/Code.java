package inflearn_codingTestPractice;

import java.util.*;

public class Code {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		String str = input.next().replaceAll("\\#","1").replaceAll("\\*", "0");
		char[] arr = str.toCharArray();
		String word = "";
		String answer = "";
		
		for(int i = 0; i < str.length(); i += 7 ) {
			for(int j = i; j < i+7; j++) {
				word += arr[j];
			}
			int code = Integer.valueOf(word, 2);
			answer += (char)code;
			word ="";
		}
		System.out.println(answer);
	}
}

/*
 * [inflearn 알고리즘 문제 풀이]
 * "#"는 2진수의 1로, "*"는 2진수의 0 으로 해석하여, 2진수를 10진수로,
 * 10진수를 아스키코드로 변환하여 암호를 해독하는 문제
 */
 