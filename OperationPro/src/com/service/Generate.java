package com.service;

import java.util.Random;

import com.model.Fraction;

public class Generate {

		// 生成算式
		public static void generateFormula(int limit) {
			
			String exp = "";
			Random r = new Random();
			
			char[] c = { '+', '-', '*', '÷' };
			int s = r.nextInt(3);
			switch (s) {
				//一个运算符
				case 0:{
					int franum = r.nextInt(2);
					if(franum==0){
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2);
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString();
					}else if(franum == 1){
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2,index3);
						
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString();
					}else if(franum == 2) {
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						Fraction f = new Fraction(index,index2);
						Fraction f2 = new Fraction(index3,index4);
						
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString();
					}
					break;
				}
				//两个运算符
				case 1: {
					int franum = r.nextInt(3);
					if(franum==0){
						//无分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2);
						Fraction f3 = new Fraction(index3);
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " + f3.toString();
					}else if(franum == 1){
						//一个分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2);
						Fraction f3 = new Fraction(index3,index4);
						
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString();
					}else if(franum == 2){
						//两个分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						int index5 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2,index3);
						Fraction f3 = new Fraction(index4,index5);
						
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString();
					
					}else if(franum == 3){
						//三个分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						int index5 = r.nextInt(limit);
						int index6 = r.nextInt(limit);
						Fraction f = new Fraction(index,index2);
						Fraction f2 = new Fraction(index3,index4);
						Fraction f3 = new Fraction(index5,index6);
						
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString();
					
					}
					break;
				}
				//三个符号	
				case 2: {
					int franum = r.nextInt(3);
					if(franum==0){
						//无分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2);
						Fraction f3 = new Fraction(index3);
						Fraction f4 = new Fraction(index4);
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString()+" " + c[r.nextInt(4)] + " " +f4.toString();
					}else if(franum == 1){
						//一个分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						int index5 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2);
						Fraction f3 = new Fraction(index3);
						Fraction f4 = new Fraction(index4,index5);
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString()+" " + c[r.nextInt(4)] + " " +f4.toString();
					}else if(franum == 2){
						//两个分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						int index5 = r.nextInt(limit);
						int index6 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2);
						Fraction f3 = new Fraction(index3,index4);
						Fraction f4 = new Fraction(index5,index6);
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString()+" " + c[r.nextInt(4)] + " " +f4.toString();
						
					}else if(franum == 3){
						//三个分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						int index5 = r.nextInt(limit);
						int index6 = r.nextInt(limit);
						int index7 = r.nextInt(limit);
						Fraction f = new Fraction(index);
						Fraction f2 = new Fraction(index2,index3);
						Fraction f3 = new Fraction(index4,index5);
						Fraction f4 = new Fraction(index6,index7);
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString()+" " + c[r.nextInt(4)] + " " +f4.toString();
						
					}else if(franum == 3){
						//四个分数
						int index = r.nextInt(limit);
						int index2 = r.nextInt(limit);
						int index3 = r.nextInt(limit);
						int index4 = r.nextInt(limit);
						int index5 = r.nextInt(limit);
						int index6 = r.nextInt(limit);
						int index7 = r.nextInt(limit);
						int index8 = r.nextInt(limit);
						Fraction f = new Fraction(index,index2);
						Fraction f2 = new Fraction(index3,index4);
						Fraction f3 = new Fraction(index5,index6);
						Fraction f4 = new Fraction(index7,index8);
						exp = "" + f.toString() + " " + c[r.nextInt(4)] + " " + f2.toString() + " " + c[r.nextInt(4)] + " " +f3.toString()+" " + c[r.nextInt(4)] + " " +f4.toString();
					}
					break;
				}
					
			}
			
			System.out.println(exp);
		}
	
}
