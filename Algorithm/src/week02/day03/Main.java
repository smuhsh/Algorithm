package week02.day03;

import java.util.Scanner;

/*
 * 작성일:2024-06-27
 * 작성자:황석현
 * 개요: 알고리즘 100제 7번 문항
 * 		입력된 수 가 소수인지 판별하시오
 * 		ex) 13
 * 		정답 : 13은 소수 입니다.
 * 		Tag >> 반복문 (for, while), if
 * 		
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요(소수판별) :");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		boolean isPrimeNumber = true;
		
		for(int i=2; i <=input -1; i++) {
			
			//소수가 아니면 거짓
			if(input % i == 0) {
				isPrimeNumber = false;
			}
		}
		if(isPrimeNumber) {
			System.out.println(input + "은 소수입니다.");
		}
		else {
			System.out.println(input + "은 소수가 아닙니다.");
		}
		sc.close();
		
	}

}
