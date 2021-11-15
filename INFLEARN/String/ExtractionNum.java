package inflearn_codingTestPractice;


import java.util.*;
public class ExtractionNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		String answer ="";
		
		for(char x : str.toCharArray()) {
			if( Character.isDigit(x) == true) {
				answer += x;
			}
		}
		
		System.out.println(Integer.parseInt(answer));
	}

}

/*
[inflearn algorithm ]
extract number in string
*/
