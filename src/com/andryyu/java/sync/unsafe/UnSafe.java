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
	  
	     //�����Ƿ�ͬ���ģ���Ϊ�߳�athread�����numRef1�Ķ�������
	     //��bthread�̻߳�ȡ����numRef2�Ķ����������ǲ�û���ڻ�ȡ�����о�����ϵ����ˣ����ַ�ͬ���Ľ��
	  
	     HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
	     HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
	 
	     ThreadA athread = new ThreadA(numRef1);
	     athread.start();
	 
	     ThreadB bthread = new ThreadB(numRef2);
	     bthread.start();
	  }*/
}
