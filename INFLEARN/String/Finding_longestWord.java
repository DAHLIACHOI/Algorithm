package inflearn_codingTestPractice;

import java.util.*;

public class Finding_longestWord {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arr = str.split(" ");
		int max = 0;
		String answer = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() > max) {
				answer = arr[i];
				max = arr[i].length();
			}
		}
		System.out.println(answer);
	}
}

/*
 * [inflearn �˰��� ���� Ǯ��]
 * 
 * ����ȿ��� ���� �� �ܾ ����Ѵ�. (��, ���� ������ ���ڰ� �ִٸ� ���� ���� ���ڸ� ����Ѵ�.)
 */