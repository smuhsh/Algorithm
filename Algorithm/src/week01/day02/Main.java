package week01.day02;
/*
 * 작성일:2024-06-18
 * 작성자:황석현
 * 개요: 알고리즘 기초 100제 1번 학생이름 저장 및 검색
 * 
 * 		피보나치 수열을 출력해라
 * 		An = An-1 + An-2
 * 		1 1 2 3 5 8 13 21 34 ...
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		/*첫번째 방법 : 배열을 이용하기*/
		int []arr = new int[100];
		
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1
		arr[1]=1;
		arr[2]=1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/*두번쨰 방법: 변수2개에 저장하기*/
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1		
		int prevPrevNum = 1;	//An-2
		int prevNum = 1;		//An-1
		
		System.out.print(prevPrevNum+" ");
		System.out.print(prevNum+" ");
		
		for(int i=3; i<=10; i++) {
			int nNum = prevPrevNum+ prevNum;
			System.out.print(nNum+" ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
		
		
	}

}
