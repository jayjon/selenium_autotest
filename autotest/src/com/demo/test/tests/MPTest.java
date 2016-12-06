package com.demo.test.tests;

public class MPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maopao();
	}
	
	/**冒泡排序*/
	public static void maopao(){
		int a[] ={5,6,90,22,43};
		for(int i=0;i<=a.length-1;i++){
			System.out.println("a.length"+a.length);
			for(int j=0;j<=i;j++){
				if(a[j]>a[i]){
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
					
				    }
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	

}
