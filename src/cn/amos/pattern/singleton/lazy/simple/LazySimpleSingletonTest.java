package cn.amos.pattern.singleton.lazy.simple;

import cn.amos.pattern.singleton.lazy.Executor;

public class LazySimpleSingletonTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Executor());
		Thread t2 = new Thread(new Executor());
		t1.start();
		t2.start();
		System.out.println("end...");
	}

}
