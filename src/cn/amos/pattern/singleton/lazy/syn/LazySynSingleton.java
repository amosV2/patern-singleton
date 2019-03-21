package cn.amos.pattern.singleton.lazy.syn;

public class LazySynSingleton {

	private static LazySynSingleton instance;

	private LazySynSingleton(){}

	public static LazySynSingleton getInstance(){
		if (instance == null) {
			synchronized (LazySynSingleton.class) {
				instance = new LazySynSingleton();
			}
		}
		return instance;
	}

}
