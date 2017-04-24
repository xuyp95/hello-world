/*
 * 
 * 出处：http://blog.csdn.net/jason0539/article/details/23297037/
 * 
 */

package com.xuyp.git.mode;

/**
 * java 23模式之单例模式
 * 
 * 单例模式有以下特点：
 * 1、单例类只能有一个实例。
 * 2、单例类必须自己创建自己的唯一实例。
 * 3、单例类必须给所有其他对象提供这一实例。
 * 出处：http://blog.csdn.net/jason0539/article/details/23297037/
 * @author xuyp
 * @date 2017年4月24日 下午2:30:57
 * @version v1.0
 */
public class SingletonMode {
	
	//懒汉式单例
	private static SingletonMode singletonMode= null;
	
	//将构造函数设置为私有的，防止在外部被实例化(java 虚拟机反射机制好像还是可以根据私有构造函数创建实例)
	private SingletonMode(){
		
	}
	
	/**
	 * 静态工厂模式
	 * 该方法虽可实现单例模式，但在多线程情况下并不满足条件
	 * @author xuyp
	 * @date 2017年4月24日 下午2:44:07
	 * @return
	 */
	public static SingletonMode getSingleMode() {
		if (singletonMode == null) {
			singletonMode = new SingletonMode();
		}
		return singletonMode;
	}
	
	/**
	 * （1）synchronized 表示一次只能有一个线程进入该方法,其他线程要想在此时调用该方法,只能排队等候,当前线程(就是在synchronized方法内部的线程)执行完该方法后,别的线程才能进入.
	 * @author xuyp
	 * @date 2017年4月24日 下午2:45:43
	 * @return
	 */
	public synchronized static SingletonMode singletonMode2() {
		if (singletonMode == null) {
			singletonMode = new SingletonMode();
		}
		return singletonMode;
	}

	/**
	 * (2)双重检查
	 * @author xuyp
	 * @date 2017年4月24日 下午2:55:42
	 * @return
	 */
	public static SingletonMode singletonMode3 () {
		if (singletonMode == null) {
			synchronized (SingletonMode.class) {
				if (singletonMode == null) {
					singletonMode = new SingletonMode();
				}
			}
		}
		return singletonMode;
	}
	
	/**
	 * (3) 静态内部类,对比前两种，即解决了多线程问题（线程安全），又不用去考虑同步的性能问题
	 * @author xuyp
	 * @date 2017年4月24日 下午2:56:12
	 * @return
	 */
	private static class lazyHolder {
		private static final SingletonMode SINGLETON_MODE = new SingletonMode();
	}
	public static SingletonMode getSingleMode4() {
		return lazyHolder.SINGLETON_MODE;
	}
		
	
	
	//饿汉式单例
	//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
	public static final SingletonMode SINGLETON_MODE_2 = new SingletonMode();
	public static SingletonMode getSingletonMode5 () {
		return SINGLETON_MODE_2;
	}
}
