package inflearn_codingTestPractice;

import java.util.*;

public class reverse_word {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String[] array = new String[N];
		ArrayList<String> answer = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			array[i] = input.next();
		}
		
		for (String x : array) {
			char[] ch = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = ch[lt];
				ch[lt] = ch[rt];
				ch[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(ch);
			answer.add(tmp);
		}
	
		for(String s : answer) {
			System.out.println(s);
		}
	}
}


/*
 * [inflearn 알고리즘 문제풀이]
 * 
 * 입력한 단어 뒤집에서 출력하기
 */
