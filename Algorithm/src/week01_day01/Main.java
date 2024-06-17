package week01_day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*
 * 작성일:2024-06-17
 * 작성자:황석현
 * 개요: 알고리즘 기초 100제 1번 학생이름 저장 및 검색
 * 
 * 		학생정보들을 저장하고, 학생이름으로
 * 		검색했을 때 학번을 출력하는 프로그램 작성
 * 		Student 클래스 생성
 * 		String name, no 를 가짐(이름과 학번)
 * 
 * 		학생들을 ArrayList에 저장한 이후,
 * 		계속 검색을 하겠느냐 y → 반복
 * 		종료하고 싶으면 n → 프로그램 종료
 * 
 * 		학생 이름이 있는경우 그 학생의 학번을 출력
 * 		학생 이름이 없으면, 없는 학새이름이라고 출력
 * 
 */

	public static void main(String[] args) {
		
		Student st1 = new Student("황석현", "pd0a6800");
		Student st2 = new Student("홍길동", "pd0a6801");
		Student st3 = new Student("김유신", "pd0a6802");
		
		ArrayList <Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for(Student stu :list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색을 하고싶으시면 y, 종료하고싶으면 n");
			String input = sc.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = sc.next();
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은:"+stu.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
			}
			else if (input.equals("n")) {
				break;
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
	}

}
