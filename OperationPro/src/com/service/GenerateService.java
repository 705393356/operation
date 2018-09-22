package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.model.Fraction;
import com.model.ResultMap;

public class GenerateService {

		 private static FractionService fractionService = new FractionService();
	
		// 生成算式
		public static ResultMap generateFormula(int limit) {
			
			String exp = "";
			boolean result = false;
			Random r = new Random();
			
			char[] c = { '+', '-', '*', '÷' };
			int s = r.nextInt(3);
			List l = new ArrayList();
			switch (s) {
				//一个运算符
				case 0:{
					
					int franum = r.nextInt(2);
					if(franum==0){
			
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(false,limit);
						
						String symbol = String.valueOf(c[r.nextInt(4)]);
						exp = "" + f.toString() + " " + symbol + " " + f2.toString();
						l.add(f);
						l.add(symbol);
						l.add(f2);
					}else if(franum == 1){
		
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(true,limit);
						
						String symbol = String.valueOf(c[r.nextInt(4)]);
						exp = "" + f.toString() + " " + symbol + " " + f2.toString();
						l.add(f);
						l.add(symbol);
						l.add(f2);
					}else if(franum == 2) {
//						
						Fraction f = new Fraction(true,limit);
						Fraction f2 = new Fraction(true,limit);
						
						String symbol = String.valueOf(c[r.nextInt(4)]);
						exp = "" + f.toString() + " " + symbol + " " + f2.toString();
						l.add(f);
						l.add(symbol);
						l.add(f2);
					}
//					result = fractionService.isrule(l);
					break;
				}
				//两个运算符
				case 1: {
					int franum = r.nextInt(3);
					if(franum==0){
						//无分数
						
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(false,limit);
						Fraction f3 = new Fraction(false,limit);
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " + f3.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
					}else if(franum == 1){
						//一个分数
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(false,limit);
						Fraction f3 = new Fraction(true,limit);
						
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " + f3.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
					}else if(franum == 2){
						//两个分数
						
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(true,limit);
						Fraction f3 = new Fraction(true,limit);
						
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " + f3.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
					}else if(franum == 3){
						//三个分数
						Fraction f = new Fraction(true,limit);
						Fraction f2 = new Fraction(true,limit);
						Fraction f3 = new Fraction(true,limit);
						
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " + f3.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
					}

//					result = fractionService.isrule(l);
					break;
				}
				//三个符号	
				case 2: {

					int franum = r.nextInt(3);
					if(franum==0){
						//无分数
						
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(false,limit);
						Fraction f3 = new Fraction(false,limit);
						Fraction f4 = new Fraction(false,limit);
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						String symbol3 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " +f3.toString()+" " + symbol3 + " " +f4.toString();
					
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
						l.add(symbol3);
						l.add(f4);
					}else if(franum == 1){
						//一个分数
						
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(false,limit);
						Fraction f3 = new Fraction(false,limit);
						Fraction f4 = new Fraction(true,limit);
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						String symbol3 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " +f3.toString()+" " + symbol3 + " " +f4.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
						l.add(symbol3);
						l.add(f4);
					}else if(franum == 2){
						//两个分数
						
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(false,limit);
						Fraction f3 = new Fraction(true,limit);
						Fraction f4 = new Fraction(true,limit);
						
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						String symbol3 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " +f3.toString()+" " + symbol3 + " " +f4.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
						l.add(symbol3);
						l.add(f4);
					}else if(franum == 3){
						//三个分数
						
						Fraction f = new Fraction(false,limit);
						Fraction f2 = new Fraction(true,limit);
						Fraction f3 = new Fraction(true,limit);
						Fraction f4 = new Fraction(true,limit);
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						String symbol3 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " +f3.toString()+" " + symbol3 + " " +f4.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
						l.add(symbol3);
						l.add(f4);
					}else if(franum == 3){
						//四个分数
						Fraction f = new Fraction(true,limit);
						Fraction f2 = new Fraction(true,limit);
						Fraction f3 = new Fraction(true,limit);
						Fraction f4 = new Fraction(true,limit);
						
						String symbol1 = String.valueOf(c[r.nextInt(4)]);
						String symbol2 = String.valueOf(c[r.nextInt(4)]);
						String symbol3 = String.valueOf(c[r.nextInt(4)]);
						
						exp = "" + f.toString() + " " + symbol1 + " " + f2.toString() + " " + symbol2 + " " +f3.toString()+" " + symbol3 + " " +f4.toString();
						l.add(f);
						l.add(symbol1);
						l.add(f2);
						l.add(symbol2);
						l.add(f3);
						l.add(symbol3);
						l.add(f4);
					}
					
					break;
				}
					
			}
			for(int i=0;i<l.size();i++){
				if(i%2!=0){
					if(l.get(i).equals("÷")){
						l.set(i, "/");
					}
				}
			}
			result = fractionService.isrule(l);
			System.out.println(result);
			if(result==false){
				System.out.println("除号后为0");
			}else {
				System.out.println(123);
			}
			System.out.println(exp);
			
			
			return  null;
		}
	
}
