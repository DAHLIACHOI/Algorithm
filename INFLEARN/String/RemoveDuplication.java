package inflearn_codingTestPractice;

import java.util.*;

public class RemoveDuplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String answer = "";
		
		for(int i =0; i < str.length(); i++) {
			if( i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		System.out.println(answer);
	}
}


/*
 * [ inflearn �˰��� ���� Ǯ�� ]
 * 
 * �ߺ��� ���� �����ϱ�
 * ( �ݺ����� ������ i�� �� i��°�� charAt�� ���ڰ� ������ ������� �����.
 *   ���� �ߺ��� ������ ��쿡�� charAt�� ���� ���� ���� ������ ������ ������ ������ i�� ���� ���� ����.)
 */