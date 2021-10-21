package inflearn_codingTestPractice;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next().toLowerCase();
		int i = 0;
		
		System.out.println(solution(str));
	}
	
	public static String solution(String str) {
		/*
		int i = 0; 
		for(int j = str.length()-1; j >= str.length()/2; j--) {
			if(str.charAt(i) != str.charAt(j))
				return "NO";
			i++;
		}
		return "YES"; */ // 1번 방법
		
		
		StringBuffer sb = new StringBuffer(str);
		if(str.equals(sb.reverse().toString())) return "YES";
		return "NO"; //2번 방법
	}
}

/*
 * [ inflearn 알고리즘 문제 풀이 ]
 * 
 * 회문인지 판별하기
 */