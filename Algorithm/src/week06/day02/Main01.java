package week06.day02;

/*
 * 작성일:2024-07-16
 * 작성자:황석현
 * 개요: 정보처리기사 실기 기출문제 코딩
 * 		[정보처리기사 실기] 2023년 3회 기출문제 풀이
 * 		https://www.youtube.com/watch?v=L7-_T6IliK8
 * 		
 * */

class A {
	public void paint() {
		System.out.println("A");
		draw();
	}
	public void draw() {
		System.out.println("B");
		draw();
	}
}

class B extends A {
	public void paint() {
		super.draw();
		System.out.println("C");
		this.draw();
		
	}
	public void draw() {
		System.out.println("D");
	}
}


public class Main01 {

	public static void main(String[] args) {
		A b = new B();
		b.paint();
		b.draw();
		
	}

}
