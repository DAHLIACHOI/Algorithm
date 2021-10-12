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
 * [inflearn java algorithm 문제 풀이]
 * 
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 들어있는지 개수 확인
 * 대소문자를 구별하지 않는다
 * 
 */
