package inflearn_codingTestPractice;


import java.util.*;

public class Palindrome_alphabet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = "";
		
		for(char ch : str1.toCharArray()) {
			if(Character.isUpperCase(ch) == true)
				str2 += Character.toLowerCase(ch);
			else if(Character.isLowerCase(ch) == true)
				str2 += ch;
		}
		System.out.println(solution(str2));
	}
	
	public static String solution(String str) {
		StringBuffer sb = new StringBuffer(str);
		if(str.equals(sb.reverse().toString())) return "YES";
		return "NO";
	}
}

/**
 * [inflearn 알고리즘 문제 풀이]
 * 
 * 팰린드롬 찾기
 * 회문 검사를 할 때, 소문자 대분자 구별하지 않고, 오직 알파벳만 비교하도록 하기
 * 
 */
