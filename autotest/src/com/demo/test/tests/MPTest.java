package com.demo.test.tests;

public class MPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maopao();
		charu();
	}
	
	/**冒泡排序*/
	public static void maopao(){
		int a[] ={5,6,90,22,43};
		for(int i=0;i<=a.length-1;i++){
			//System.out.println("a.length"+a.length);
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
	/**插入排序*/
	public static void charu(){
		int i,j;
		int arr[] ={1,5,8,0};
		int n=arr.length;
		int target;
		 //假定第一个元素被放到了正确的位置上
	    //这样，仅需遍历1 - n-1
		for(i = 1; i < n; i++){
			j=i;
			target=arr[i];
			while(j > 0 && target < arr[j - 1]){
				arr[j] = arr[j - 1];
	            j--;
			}
			arr[j]=target;
			System.out.println("***"+arr[j]);
		}
	}

}
