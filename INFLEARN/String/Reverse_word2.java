package inflearn_codingTestPractice;

import java.util.*;

public class Reverse_word2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		char[] ch = str.toCharArray();
		int lt = 0, rt= str.length()-1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(ch[lt])) lt++;
			else if(!Character.isAlphabetic(ch[rt])) rt--;
			else {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			}
		}
		String answer = String.valueOf(ch);
		System.out.println(answer);
	}
}

/**
 * [inflearn �˰��� ����Ǯ�� ]
 * 
 * Ư�� ���� ������, Ư�����ڰ� �ƴ� ���ĺ��� �����´�.
 * 
 */

