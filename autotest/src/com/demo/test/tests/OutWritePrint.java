package com.demo.test.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutWritePrint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeflie();
		Outputwrite();
	}
	/**创建目录的方法*/
	 static File f =new File("F:\\JavaTest\\test\\test.txt");
	 
public static void Outputwrite() throws IOException{
	//构建FileOutputStream对象,文件不存在会自动新建
	 FileOutputStream fop = new FileOutputStream(f);
	// 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
	  OutputStreamWriter writer = new OutputStreamWriter(fop, "GBK");
	  writer.append("hello world");
	  writer.append("\r\n");
	  writer.append("English");
	  //关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
	  writer.close();
	   
	// 关闭输出流,释放系统资源
	  fop.close();
	    
	// 构建FileInputStream对象
	  FileInputStream fis = new FileInputStream(f);
	// 构建InputStreamReader对象,编码与写入相同
	  InputStreamReader reader = new InputStreamReader(fis,"GBK");
	  StringBuffer sb =new StringBuffer();
	  while(reader.ready()){
		  //转成char加到StringBuffer对象中
		  sb.append((char) reader.read());
	  } System.out.println(sb.toString());
	    reader.close();
	    // 关闭读取流
	    
	    fis.close();
	    // 关闭输入流,释放系统资源
}
	public static void writeflie(){
		if(f.isDirectory()==false){
			  f.mkdirs();
			  System.out.println("创建成功"+f);
		}else{
			 System.out.println("目录已存在"+f);
		}
		
	
	}
	  
	
	
	
	
	
	
	
	
	

}
