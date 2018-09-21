package com.model;



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
		if(this.denominator==1){
			return "" + this.nominator;
		}
		return "" +this.denominator+"/" +this.nominator;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Fraction [denominator=" + denominator + ", nominator=" + nominator + "]";
	}

	// 加法运算
	Fraction add(Fraction r){  
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * b + denominator * a;
		int newDenominator = denominator * b;
		Fraction result = new Fraction(newNominator,newDenominator);
		return result;
	}
	
	
	// 减法运算
	Fraction sub(Fraction r){  
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * b - denominator * a;
		int newDenominator = denominator * b;
		Fraction result = new Fraction(newNominator,newDenominator);
		return result;
	} 
	
	//分数的乘法运算
	Fraction muti(Fraction r){ // 乘法运算
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * a;
		int newDenominator = denominator * b;
		Fraction result = new Fraction(newNominator,newDenominator);
		return result;
	}
	
	//分数除法运算
	Fraction div(Fraction r){  
		int a = r.getNominator();//获得分子
		int b = r.getDenominator();//获得分母
		int newNominator = nominator * b;
		int newDenominator = denominator * a;
		Fraction result = new Fraction(newNominator,newDenominator);
		return result;
	}
}
