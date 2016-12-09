package com.demo.test.utils;
/**线程类*/
public class ThreadUtil implements Runnable{
	   private Thread t;
	   private String threadName;
	   /**有参的构造方法*/
	   public ThreadUtil(String NAME) {
	      threadName = NAME;
	      System.out.println("Creating " +  threadName );
	   }
	   public void start () {
		      System.out.println("Starting " +  threadName );
		      if (t == null) {
		         t = new Thread (this, threadName);
		         t.start ();
		      }
		   }
		@Override
	public void run() {
		 System.out.println("Running " +  threadName );
	      try {
	         for(int i = 4; i > 0; i--) {
	            System.out.println("Thread: " + threadName + ", " + i);
	            // 让线程睡眠一会
	            Thread.sleep(50);
	         }
	      }catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
		
	}

	

	

}

