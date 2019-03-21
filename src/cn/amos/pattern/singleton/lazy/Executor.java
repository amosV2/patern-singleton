package cn.amos.pattern.singleton.lazy;

import cn.amos.pattern.singleton.lazy.doublecheck.LazyDoubleCheckSingleton;
import cn.amos.pattern.singleton.lazy.simple.LazySimpleSingleton;
import cn.amos.pattern.singleton.lazy.syn.LazySynSingleton;

public class Executor implements Runnable {
	@Override
	public void run() {
//		LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
//		LazySynSingleton instance = LazySynSingleton.getInstance();
		LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
		System.out.println(instance);
	}
}
