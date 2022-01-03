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
 * [inflearn �˰��� ���� Ǯ��]
 * ���ĺ� �빮�ڷ� �̷���� ���ڿ��� �Է¹޾� ���� ���ڰ� �������� �ݺ��Ǵ� ��� �ݺ��Ǵ�
 * ���� �ٷ� �����ʿ� �ݺ� Ƚ���� ǥ���ϴ� ������� ���ڿ��� �����ϱ�. ��, �ݺ�Ƚ���� 1�ΰ��� ����
 * */
