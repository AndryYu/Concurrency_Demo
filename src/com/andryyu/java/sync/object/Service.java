package com.andryyu.java.sync.object;

public class Service {

    String anyString = new String();
 
    public Service(String anyString){
        this.anyString = anyString;
    }
 
    public void setUsernamePassword(String username, String password) {
        try {
        	//线程争夺的是anyString的对象锁
            synchronized (anyString) {
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "进入同步块");
                Thread.sleep(3000);
                System.out.println("线程名称为：" + Thread.currentThread().getName()
                        + "在" + System.currentTimeMillis() + "离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
