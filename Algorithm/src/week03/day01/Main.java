package week03.day01;

import java.util.Scanner;

/*
 * 작성일:2024-07-02
 * 작성자:황석현
 * 개요: 알고리즘 100제 9번 문항
 * 		입력된 수의 각 자릿수 합을 구하시오
 * 		ex) 1242
 * 		정답 9
 * 		Tag) 반복문(for ,while)
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("숫자입력 :");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		
//		for(int i=0; i<=input; i++) {
//			sum += input %10;
//			input /= 10;
//		}
		
		while(input > 0) {
			sum += input % 10;
			input /= 10;
		}
		
		System.out.println("합 :"+sum);
		sc.close();
		
	}

}
