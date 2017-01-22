package com.demo.test.tests;

public class TestArray {

	public static void main(String[] args) {
		double[] myList ={1.9,2.9,3.9,2.5};
		//打印所有数组元素
		for(int i=0;i<myList.length;i++){
			System.out.println(myList[i]+"a");
		}
		//计算所有数组的和
		double total=0;
		for(int i=0;i<myList.length;i++){
			total += myList[i];
			System.out.println(total+"b");
		}
		 // 查找最大元素
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);
	   }

	}

