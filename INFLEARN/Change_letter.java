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
 * [inflearn �˰��� ���� Ǯ�� ]
 * 
 * �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ�,�ҹ��ڴ� �빮�ڷ� �����ؼ� ����Ѵ�.
 * 
 */