package com.model;

import java.util.ArrayList;
import java.util.List;

import com.service.FractionService;

public class Main {

	
	public static void main(String[] args) {
		Fraction f1=new Fraction(1,4);
		Fraction f2=new Fraction(1,3);
		Fraction f3=new Fraction(2,0);
		
		List list = new ArrayList();
		list.add(f1);
		list.add("/");
		list.add(f2);
		list.add("+");
		list.add(f3);
		
		FractionService f4=new FractionService();
		
		System.out.println(f4.isrule(list));
		
	}
}
