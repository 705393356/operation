package com.model;

import java.util.List;

/*
 * 计算等式的计算类
 */
public class Calculation {


	/*
	 * 计算方法
	 */
	public Fraction result(List list,int num){
		Fraction calculaResult = null;
		
		switch (num) {
		case 1:
			String s = (String)list.get(1); 
			Fraction f1 = (Fraction)list.get(0);
			Fraction f2 = (Fraction)list.get(2);
			if(s.equals("+")){
				calculaResult = f1.add(f2);
			}else if (s.equals("-")) {
				calculaResult = f1.sub(f2);
			}else if (s.equals("*")) {
				calculaResult = f1.muti(f2);
			}else {
				calculaResult = f1.div(f2);
			}
			break;
			
		case 2:
			String s1 = (String)list.get(1);
			String s2 = (String)list.get(3);
			if(s1.equals("+")){
				
			}
		default:
			break;
		}
		
		return calculaResult;
	}
}
