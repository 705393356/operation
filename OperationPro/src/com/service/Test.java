package com.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.model.Fraction;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Generate.generateFormula(5);
//		List l = new ArrayList();
//		l.add(new Fraction(1,3));
//		l.add("*");
//		l.add(new Fraction(1,11));
//		l.add("/");
//		l.add(new Fraction(11,20));
//		l.add("-");
//		l.add(new Fraction(23,4));
//		CalculateService c = new CalculateService();
//		c.calculate(l);
//		if(l.size()==1){
//			System.out.println(l.get(0).toString());
//		}
		
		CheckService.Check("D:\\1.txt","D:\\2.txt");
		
		
	}


}
