package com.andryyu.java.sync.cls;

public class Service {
	
	public static synchronized  void printA() {
        try {
            System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
                    + "��" + System.currentTimeMillis() + "����printA");
            Thread.sleep(3000);
            System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
                    + "��" + System.currentTimeMillis() + "�뿪printA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
    public static synchronized  void printB() {
        System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName() + "��"
                + System.currentTimeMillis() + "����printB");
        System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName() + "��"
                + System.currentTimeMillis() + "�뿪printB");
    }
}
