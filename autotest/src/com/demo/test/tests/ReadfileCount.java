package com.demo.test.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadfileCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="E://123.txt";
		readFileByLines(fileName);
		
		
	}
	
	    public static void readFileByLines(String fileName) {  
	        File file = new File(fileName);  
	        BufferedReader reader = null;  
	        try {  
	            System.out.println("以行为单位读取文件内容，一次读一整行：");  
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	            int line = 1;  
	            int count=0;
	            int timeOutCount=0;
	            // 一次读入一行，直到读入null为文件结束  
	            while ((tempString = reader.readLine()) != null) {  
	                // 显示行号  
	                //System.out.println("line " + line + ": " + tempString);  
	                line++;  
	                if(tempString.contains("字节=32")){
	                	
	                	
	                	System.out.println(tempString+"匹配所有访问目标主机的数量"+count++);
	                	
	                }else if(tempString.contains("请求超时")){
	                	System.out.println(tempString+"匹配所有访问目标主机的数量"+timeOutCount++);
	                }
	            } 
	           System.out.println("请求超时的主机总数"+timeOutCount/4+"和"+"匹配可以ping通的目标主机的总数"+count/4);
	            reader.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            if (reader != null) {  
	                try {  
	                    reader.close();  
	                } catch (IOException e1) {  
	                }  
	            }  
	        }  
	    }

		
		
	

}
