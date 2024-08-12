package week06.day02;

/*
 * 작성일:2024-07-16
 * 작성자:황석현
 * 개요: 정보처리기사 실기 기출문제 코딩
 * 		[정보처리기사 실기] 2023년 3회 기출문제 풀이
 * 		https://www.youtube.com/watch?v=L7-_T6IliK8
 * 		15번
 * 		
 * */

class Parent {
	
	int compute(int num) {
		if(num <=1) {
			return num;
		}
		return compute(num-1)+compute(num-2);
	}
		
}

class Child extends Parent{
	int compute(int num) {
		if (num <= 1) {
			return num;
		}
		return compute(num-1)+compute(num-3);
	}
	
}

public class Main02 {

	public static void main(String[] args) {
		Parent obj = new Child();
		System.out.println(obj.compute(7));
		
	}

}
