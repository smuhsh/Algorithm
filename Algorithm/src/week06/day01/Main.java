package week06.day01;

/*
 * 작성일:2024-07-15
 * 작성자:황석현
 * 개요: 정보처리기사 실기 기출문제 코딩
 * 		[24년1회] 정보처리기사 실기 가답안
 * 		https://www.gisafirst.com/board/n1/view.php?offset=0&tq=1393907668&reqCategory=&idx=447&word=&s_type=&s_content=&s_terms=
 * 		
 * */

class Connection {
	private static Connection _inst = null;
	private int count = 0;
	
	static public Connection get() {
		if (_inst == null) {
			_inst = new Connection();
			return _inst;
		}
		return _inst;
	}
	
	public void count() {
		count ++;
	}
	
	public int getCount() {
		return count;
	}
}



public class Main {

	public static void main(String[] args) {
		
		Connection conn1 = Connection.get();		
		conn1.count();
		
		Connection conn2 = Connection.get();
		conn2.count();
		
		Connection conn3 = Connection.get();
		conn3.count();
		
		System.out.println(conn1.getCount());
		
		
	}

}
