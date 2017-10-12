package com.andryyu.java.sync.cls;

public class ClsSnyc {

	public static void main(String[] args) { 
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
 
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
	
}
