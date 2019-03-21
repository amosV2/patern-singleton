package cn.amos.pattern.singleton.lazy.simple;

//有线程安全问题
public class LazySimpleSingleton {

	private static LazySimpleSingleton instance;

	private LazySimpleSingleton(){
	}

	public static LazySimpleSingleton getInstance(){
		if (instance == null) {
			instance = new LazySimpleSingleton();
		}
		return instance;
	}

}
