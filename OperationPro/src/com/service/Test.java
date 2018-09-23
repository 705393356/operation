package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Fraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Generate.generateFormula(5);
		List l = new ArrayList();
		l.add(new Fraction(1,1));
		l.add("-");
		l.add(new Fraction(1,6));
		l.add("-");
		l.add(new Fraction(1,7));
		l.add("*");
		l.add(new Fraction(1,8));
		CalculateService c = new CalculateService();
		c.calculate(l);
		if(l.size()==1){
			System.out.println(l.get(0).toString());
		}

		
	}


}
