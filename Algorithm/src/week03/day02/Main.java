package week03.day02;

import java.util.Scanner;

/*
 * 작성일:2024-07-03
 * 작성자:황석현
 * 개요: 알고리즘 100제 10번 문항
 * 		입력된 수 (N) 만큼 N행 N열의 형태로 연속으로
 * 		출력되는 숫자 사각형을 출력하시오
 * 
 * 		ex) 숫자 입력: 4
 * 		정답 1 2 3 4
 * 			5 6 7 8
 * 			9 10 11 12
 * 			13 14 15 16
 * 
 * 		Tag) 중첩 반복문 (for 또는 while)
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.printf("%4d", i*input + j + 1);
			}
			System.out.println();
		}
		sc.close();
	}

}
