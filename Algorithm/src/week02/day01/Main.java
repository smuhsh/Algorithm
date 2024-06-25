package week02.day01;

import java.util.Scanner;

/*
 * 작성일:2024-06-24
 * 작성자:황석현
 * 개요: 알고리즘 100제 6번 문항
 * 		대문자는 소문자로, 소문자는 대문자로 변환하기
 * 
 * 		ex) helloWorlD
 * 			→HELLOwORLd
 * 
 * 		Tag) 배열, for, if
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("소문자→대문자, 대문자→소문자 변환 :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char [] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>='a'&&arr[i]<='z') {
				arr[i] = (char)(arr[i]+ 'A'-'a'); //'a' 'b' ~ 'z' 'A' 'B' 'C'
			}
			else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i] - ('A'-'a'));
			}
		}
		System.out.println(arr);
		sc.close();
		
	}

}
