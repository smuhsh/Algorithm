package weer01.day04;

import java.util.Scanner;

/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 3번 최빈수 구하기
 * 		문제
 * 		가장 많이 출현한 수를 출력하시오
 * 		1 2 2 3 1 4 2 2 4 3 5 3 2
 * 		정답: 2 (5회)
 * 		Tag >> 배열, for
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("최빈수를 구합니다. 숫자를 입력해주세요 :");
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}

		/*
		 *위 배열에서 사용자가 입력한 숫자의 최빈값을 저장할 배열이 추가로 필요하다 
		 * 	ex) 1 2 2 3 1 4 2 2 4 3 5 3 2
		 *  	1: 2
		 *  	2: 4 → 최빈값
		 *  	3: 2
		 * 		4: 2
		 * 		...
		 * 
		 * */
		
		int []store = new int[arr.length];
		
		/*
		 * index → 출현한 수
		 * index 값 → index(출현한 수)가 몇번 나왔는지 저장하는 용도
		 * 
		 * store[3] = 5 → "3번숫자가 5번출현했다" 라는 의미
		 * 
		 * */
		
		//sc → 1 2 2 3 1 4 2 2 4 3
		for(int i=0; i<10; i++) {
			store[arr[i]]++;
		}
		//store[1] == 2;
		//store[2] == 4;
		//store[3] == 2;
		//store[4] == 2;
		
		int storeNum = 0; //최빈수
		int storeCnt = 0; //최빈수가 나온횟수
		
		for(int i=0; i<10; i++) {
			if(storeCnt < store[i]) {
				storeCnt = store[i];
				storeNum = i;
			}
		}
		
		System.out.println("최빈수는 :"+storeNum+"cnt :"+storeCnt);
		
	}

}
