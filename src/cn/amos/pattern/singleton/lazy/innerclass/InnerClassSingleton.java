package cn.amos.pattern.singleton.lazy.innerclass;

import java.io.Serializable;

public class InnerClassSingleton implements Serializable {

	private InnerClassSingleton(){
		if (InnerClassSingletonHolder.INSTANCE != null) {
			throw new RuntimeException("不允许创建多个实例");
		}
	}

	public static InnerClassSingleton getInstance(){
		return InnerClassSingletonHolder.INSTANCE;
	}

	private static class InnerClassSingletonHolder{
		private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
	}

	private Object readResolve(){
		return InnerClassSingletonHolder.INSTANCE;
	}

}
