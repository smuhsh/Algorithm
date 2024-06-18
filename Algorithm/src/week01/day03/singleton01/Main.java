package week01.day03.singleton01;
/*
 * 작성일:2024-06-19
 * 작성자:황석현
 * 개요: 싱글톤 패턴 연습
 * 
 * 		싱글톤 패턴?
 * 		정의: 클래스의 인스턴스를 딱 하나만 생성하여 사용하는 패턴이다.
 * 			 주로 특정 객체를 여러곳에서 공유해야할 때 사용한다. ex) DB Connection pool
 * 
 * 		장점: 메모리에 인스턴스 하나를 등록해 여러 쓰레드에서 동시에 하나의 객체를 사용할 수 있다.
 * 		단점: 동기화(여러곳에서 동시에 접근해서 생기는 문제)가 발생할 수 있어 잘 파악하고 설계해야된다.
 * 
 * 		특징: 기본생성자를 private 접근제어자로 지정해서 직접 인스턴스를 생성할 수 없게하고, 사용자에게
 * 			 인스턴스를 전달하는 static 메서드가 있다. 
 */

public class Main {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance(1);
		Singleton instance2 = Singleton.getInstance(2);
		
		instance.printMsg();
		instance2.printMsg();
		
	}

}
