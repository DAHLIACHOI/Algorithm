package inflearn_codingTestPractice;

import java.util.*;

public class Count_word {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next().toLowerCase();
		char ch = input.next().toLowerCase().charAt(0);
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}

/*
 * [inflearn java algorithm ���� Ǯ��]
 * 
 * �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� ����ִ��� ���� Ȯ��
 * ��ҹ��ڸ� �������� �ʴ´�
 * 
 */
