package com.andryyu.java.sync.object;

public class ObjectSync {
	
	 public static void main(String[] args) {
	     Service service = new Service("xiaobaoge");
	 
	     ThreadA a = new ThreadA(service);
	     a.setName("A");
	     a.start();
	 
	     ThreadB b = new ThreadB(service);
	     b.setName("B");
	     b.start();
	 }
}
