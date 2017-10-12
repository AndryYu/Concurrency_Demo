package com.andryyu.java.sync.cls;

class ThreadB extends Thread {
    
	@Override
    public void run() {
        Service.printB();
    }
}
