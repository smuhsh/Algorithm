package week01.day05;

import java.util.Scanner;

/*
 * 작성일:2024-06-20
 * 작성자:황석현
 * 개요: 10진수 → 2진수로 변환
 * 		ex) 19
 * 		정답: 10011
 * 		Tag: 배열, 반복문(while, for)
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("10진수를 2진수로 변환, 숫자를 입력 :");
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		
//		int inputNum = 19;
		int []bin = new int[100];
		
		/*
		 * 19 / 2	9 ... 1 
		 * 9 / 2	4 ... 1	
		 * 4 / 2	2 ... 0
		 * 2 / 2	1 ... 0
		 * 1 / 2	0 ... 1
		 * 
		 * */
		
		int i=0;
		int mok = inputNum;
		
		while(mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--;
		for (; i>=0; i--) {
			System.out.print(bin[i]);
		}
		
		sc.close();
		System.out.println("\n프로그램 종료");

	}

}
