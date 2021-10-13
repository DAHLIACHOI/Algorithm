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
 * [inflearn 알고리즘 문제 풀이]
 * 
 * 문장안에서 가장 긴 단어를 출력한다. (단, 같은 길이의 문자가 있다면 먼저 나온 문자를 출력한다.)
 */