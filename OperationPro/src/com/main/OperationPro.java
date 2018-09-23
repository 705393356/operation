package com.main;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.model.ResultMap;
import com.service.CalculateService;
import com.service.FractionService;
import com.service.GenerateService;

public class OperationPro {

	private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	private static GenerateService gs = new GenerateService();
	private static FractionService fs = new FractionService();
	
	public static void main(String[] args) {
		
		String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
		BufferedOutputStream bo = null; // 写入到文件的缓冲流
//		GenerateService gs = new GenerateService(); // 生成分式类
//		List<ResultMap> lists = new ArrayList<ResultMap>(); //存放分式的集合
		List<List<String>> lists = new ArrayList<List<String>>();
		ResultMap rm = null;
		int num = 2;
		int i = 0;
		
		while(i<=num){
		
		        try 
		        {
		            File file =new File("./Exercises.txt");
		            //PrintStream ps = new PrintStream(new FileOutputStream(file));
		            bo = new BufferedOutputStream(new FileOutputStream(file));
		            rm = gs.generateFormula(10);//先暂定写一个最大值为4的分式
		            if(rm!=null){
		            	boolean result = fs.intoList(rm.getExp(), lists);
		            	if(result==false){
		            		continue;
		            	}
		            	System.out.println(rm.getExp() +"=" +rm.getResult());
		            	bo.write(rm.toString().getBytes(), 0, rm.toString().length());
		            	bo.flush();
		            	bo.close();
		            	i++;
		            }
		            
		        }catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		        	System.out.println("文件输入输出异常");
					e.printStackTrace();
				}
		}
        System.out.println(date);
       
	}

}
