package com.andryyu.java.sync.object;

class ThreadA extends Thread {
    private Service service;
 
    public ThreadA(Service service) {
        super();
        this.service = service;
    }
 
    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");
 
    }
 
}
