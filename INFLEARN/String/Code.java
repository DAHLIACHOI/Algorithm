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
 * [inflearn �˰��� ���� Ǯ��]
 * "#"�� 2������ 1��, "*"�� 2������ 0 ���� �ؼ��Ͽ�, 2������ 10������,
 * 10������ �ƽ�Ű�ڵ�� ��ȯ�Ͽ� ��ȣ�� �ص��ϴ� ����
 */
 