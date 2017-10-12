package com.andryyu.java.sync.cls;

class ThreadA extends Thread {
    
	@Override
    public void run() {
        Service.printA();
    }

}