package com.demo.test.tests;

import com.demo.test.utils.ThreadUtil;

public class TestThread {

	public static void main(String[] args) {
		ThreadUtil tu = new ThreadUtil( "Thread-1");
	      tu.start();
	      
	      ThreadUtil tu1 = new ThreadUtil( "Thread-2");
	      tu1.start();

	}

}
