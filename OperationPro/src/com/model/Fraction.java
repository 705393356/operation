package com.model;

import java.util.Random;

public class Fraction {

	private int denominator;//分母
	private int nominator;//分子
	
	public Fraction(int denominator, int nominator) {
		super();
		this.denominator = denominator;
		this.nominator = nominator;
	}
	
	public Fraction(int nominator){
		this.denominator = 1;
		this.nominator = nominator;
	}
	
	public Fraction() {
		super();
	}

	public Fraction(boolean l,int limit){
		Random r = new Random();
		if(l==true){
			int index = r.nextInt(limit);
			int index2 = r.nextInt(limit);
			
			this.denominator = index;
			this.nominator = index2;
			
		}else {
			int index = r.nextInt(limit);
			this.denominator = 1;
			this.nominator = index;
		}
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public int getNominator() {
		return nominator;
	}

	public void setNominator(int nominator) {
		this.nominator = nominator;
	}

	@Override
	public String toString() {
		Appointment();
		if(this.denominator==1||this.nominator==0){
			return "" + this.nominator;
		}
		if(this.nominator>this.denominator){
			return "" + nominator/denominator + "," + nominator%denominator +"/" + denominator;
		}
		return "" +this.nominator+"/" +this.denominator;
	}
	

	// 加法运算
	public Fraction add(Fraction r){  
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * b + denominator * a;
		int newDenominator = denominator * b;
		Fraction result = new Fraction(newDenominator,newNominator);
		return result;
	}
	
	
	// 减法运算
	public Fraction sub(Fraction r){  
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * b - denominator * a;
		int newDenominator = denominator * b;
		Fraction result = new Fraction(newDenominator,newNominator);
		return result;
	} 
	
	//分数的乘法运算
	public Fraction muti(Fraction r){ // 乘法运算
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * a;
		int newDenominator = denominator * b;
		Fraction result = new Fraction(newDenominator,newNominator);
		return result;
	}
	
	//分数除法运算
	public Fraction div(Fraction r){  
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * b;
		int newDenominator = denominator * a;
		Fraction result = new Fraction(newDenominator,newNominator);
		return result;
	}
	
	private static long gcd(long a, long b) {
		// 用辗转相除法求最大公约数
		return b == 0 ? a : gcd(b, a % b);
	}

	public void Appointment() {
		// 约分操作，来自百度翻译
		if (nominator == 0 || denominator == 1)
			return;
		// 如果分子是0或分母是1就不用约分了
		long gcd = gcd(nominator, denominator);
		this.nominator /= gcd;
		this.denominator /= gcd;
	}
}
