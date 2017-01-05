package com.demo.test.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;  
 /** 循环ping网段的方法*/
public class Command {  
	 ReadfileCount rc =new ReadfileCount();
	  
    public static void main(String[] args) {  
        try {  
        	 Runtime rt = Runtime.getRuntime();  
        	for(int i=1;i<=255;i++){
        		  Process pr = rt.exec("ping 192.168.19."+i);
        		  BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream(), "GBK"));  
        		   String line = null;  
        		   
                   while ((line = input.readLine()) != null) {  
                       System.out.println("**"+line); 
                      // writerfile(line);
                   }  
               
                   int exitVal = pr.waitFor();  
                   System.out.println("Exited with error code " + exitVal);
                
        	}
        	} catch (Exception e) {  
            System.out.println(e.toString());  
            e.printStackTrace();  
        }  
       
    }  
    
   
 
}  