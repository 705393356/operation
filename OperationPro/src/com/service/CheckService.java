package com.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckService {

	
	public static void Check(String checked,String answer) throws IOException{
		
		String error = "";
		String correct = "";
		int errornum = 0;
		int correctnum = 0;
		
		String str1 = "";
		String str2 = "";
		
//		checked = "D:\\资料\\1.txt";
//		answer = "D:\\资料\\2.txt";
		File checkedfile=new File(checked);
		FileInputStream input1=new FileInputStream(checkedfile);
		BufferedReader reader1=new BufferedReader(new InputStreamReader(input1));
		
		File answerfile=new File(answer);
		FileInputStream input2=new FileInputStream(answerfile);
		BufferedReader reader2=new BufferedReader(new InputStreamReader(input2));
		
		
		while((str1=reader1.readLine())!=null&&(str2=reader2.readLine())!=null){
			if(!str1.trim().equals(str2.trim())){
				error = error + str1.substring(0, 1)+ ",";
				errornum ++ ;
			}else {
				correct = correct + str1.substring(0, 1) + ",";
				correctnum ++;
			}
			
		}
		
		System.out.println("Wrong: " + errornum + "(" + error.substring(0,error.length()-1) + ")");
		System.out.println("Correct: " + correctnum + "("+correct.substring(0, correct.length()-1)+")");
	}
	
}
