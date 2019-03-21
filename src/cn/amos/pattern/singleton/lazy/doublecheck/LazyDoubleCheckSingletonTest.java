package cn.amos.pattern.singleton.lazy.doublecheck;

import cn.amos.pattern.singleton.lazy.Executor;

public class LazyDoubleCheckSingletonTest {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Executor());
		Thread thread2 = new Thread(new Executor());
		Thread thread3 = new Thread(new Executor());
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("结束");
	}


}
