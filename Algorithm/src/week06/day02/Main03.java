package week06.day02;

/*
 * 작성일:2024-07-16
 * 작성자:황석현
 * 개요: 정보처리기사 실기 기출문제 코딩
 * 		[정보처리기사 실기] 2023년 3회 기출문제 풀이
 * 		https://www.youtube.com/watch?v=L7-_T6IliK8
 * 		18번
 * 		
 * 		JAVA 언어: 오류가 발생하는 라인을 고르시오.
 * 
 * */

class Person {
	
	private static String name;
	public Person(String val) {
		name = val;
	}
	public static String get() {
		return name;
	}
	public void print() {
		System.out.println(name);
	}
	
}

public class Main03 {

	public static void main(String[] args) {
		Person obj = new Person("Kim");
		obj.print();
		
	}

}
