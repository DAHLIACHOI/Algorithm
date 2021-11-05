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
 * [inflearn �˰��� ���� Ǯ��]
 * 
 * �Ӹ���� ã��
 * ȸ�� �˻縦 �� ��, �ҹ��� ����� �������� �ʰ�, ���� ���ĺ��� ���ϵ��� �ϱ�
 * 
 */
