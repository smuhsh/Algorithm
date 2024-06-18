package week01.day03;

public class Singleton {
	
	private static Singleton instance;
	private int msg;
	
	public Singleton(int msg) {
	}

	private static Singleton getInstance(int msg) {
		if (instance.equals(null)) {
			instance = new Singleton(msg);
		}
		return instance;
		
	}

}
