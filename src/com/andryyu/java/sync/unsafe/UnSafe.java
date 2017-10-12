package com.andryyu.java.sync.unsafe;

public class UnSafe {
	
	public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
 
        ThreadA athread = new ThreadA(numRef);
        athread.start();
 
        ThreadB bthread = new ThreadB(numRef);
        bthread.start();
    }
	
	 /*public static void main(String[] args) {
	  
	     //这里是非同步的，因为线程athread获得是numRef1的对象锁，
	     //而bthread线程获取的是numRef2的对象锁，他们并没有在获取锁上有竞争关系，因此，出现非同步的结果
	  
	     HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
	     HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
	 
	     ThreadA athread = new ThreadA(numRef1);
	     athread.start();
	 
	     ThreadB bthread = new ThreadB(numRef2);
	     bthread.start();
	  }*/
}
