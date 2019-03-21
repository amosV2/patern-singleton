package cn.amos.pattern.singleton.lazy.syn;

import cn.amos.pattern.singleton.lazy.Executor;

//有线程安全问题
public class LazySynSingletonTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Executor());
		Thread t2 = new Thread(new Executor());
		t1.start();
		t2.start();
		System.out.println("end...");
	}

}
