package oa.jn.util;
//该对象保存的是用户的信息

import oa.jn.pojo.User;

public class UserThreadLocal {
	private static ThreadLocal<User> thread = new ThreadLocal<>();
	
	public static void set(User user) {
		thread.set(user);
	}
	
	public static User get() {
		return thread.get();
	}
	
	//使用ThreadLocal必须注意内存泄漏问题
	public static void remove() {
		thread.remove();
	}
}
