package week09.day01;

/*
 * 작성일:2024-08-12
 * 작성자:황석현
 * 개요: 정보처리기사 실기 기출문제 코딩
 * 		[정보처리기사 실기] 2023년 1회 기출문제 풀이
 * 		https://www.youtube.com/watch?v=uN0Y8aj2QDE
 * 		
 * 		다음 java 로 구현된 프로그램을 분석하여 그 실행 결과를 쓰시오.
 * */
//변수 사용의 우선순위는 자기 자신의 블록 안의 값이 가장높은 우선순위를 가진다
class Static {
	public int a = 20;
	static int b = 0;
}

public class Test {

	public static void main(String[] args) {
		int a = 10;
		Static.b = a; 	//스태틱 변수는 단 한번만 생성되어서 공유되는 변수이다
						//변수 참조하는 값 가장 우선순위는 자신의 블록안에 있는 값이다
		Static st = new Static();
		System.out.println(Static.b++);
		System.out.println(st.b);
		System.out.println(a); 
		System.out.println(st.a);
	}

}
