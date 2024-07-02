package week02.day04;

import java.util.Scanner;

/*
 * 작성일:2024-06-28
 * 작성자:황석현
 * 개요: 알고리즘 100제 8번 문항
 * 		입력된 수의 팩토리얼을 구하시오
 * 		ex) 숫자 5 입력하면...
 * 		정답: 120
 * 		Tag 반복문(for, while)
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요(팩토리얼) :");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int sum = 1;
		
		for(int i=1; i<=input; i++) {
			sum *= i;
		}
		System.out.println(sum);
		
		sc.close();
		
	}

}
