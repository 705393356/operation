package com.model;

public class Fraction {

	private int denominator;
	private int nominator;
	
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
	
	
	
}
