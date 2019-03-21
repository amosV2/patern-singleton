package cn.amos.pattern.singleton.hungry;

public class HungrySingleton {

	private static final HungrySingleton INSTANCE = new HungrySingleton();

	public static HungrySingleton getInstance(){
		return INSTANCE;
	}


}
