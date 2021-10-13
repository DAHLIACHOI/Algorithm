package inflearn_codingTestPractice;

import java.util.*;

public class Change_letter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String answer = "";
		
		for(char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch) == true)
				answer += Character.toLowerCase(ch);
			
			else
				answer += Character.toUpperCase(ch);
		}
		System.out.println(answer);
	}
}


/*
 * [inflearn 알고리즘 문제 풀이 ]
 * 
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로,소문자는 대문자로 변경해서 출력한다.
 * 
 */