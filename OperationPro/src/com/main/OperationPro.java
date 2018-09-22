package com.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OperationPro {

	private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	
	public static void main(String[] args) {
		String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        //文件操作
        PrintStream ps = null;
        try 
        {
            File file =new File("./Exercises.txt");
            ps = new PrintStream(new FileOutputStream(file));
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
        ps.println(date);
        
       
        
        
        

	}

}
