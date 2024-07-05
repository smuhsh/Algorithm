package week03.day04;

import java.util.Scanner;

/*
 * 작성일:2024-07-05
 * 작성자:황석현
 * 개요: 알고리즘 100제 11번 문항
 * 		입력된 수(N) 만큼 N행 N열의 형태로
 * 		아래와 같이 출력되는 숫자 사각형을 출력하시오
 * 
 * 		ex) 숫자입력 : 4
 * 		정답	1 2 3 4
 * 			8 7 6 5
 * 			9 10 11 12
 * 			16 15 14 13
 * 
 * 		Tag) 중첩반복문(for 문 또는 while), 조건문(if), 배열
 * 
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int arr [][] = new int[input][input];
		
		for(int i=0; i<input; i++) {
			if(i%2==0) {
				for(int j=0; j<input; j++) {
					arr[i][j] = i*input + j+1;
				}
			}
			else {
				for(int j= input-1; j>=0; j--) {
					arr[i][j] = i*input + input-j;
				}
			}
		}
		
		for(int i=0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
