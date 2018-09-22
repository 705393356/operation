package com.model;

/*
 * 结果集合
 */
public class ResultMap {

	private String exp; //运算表达式
	private String result; //运算结果
	
	public ResultMap(String exp, String result) {
		super();
		this.exp = exp;
		this.result = result;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return exp + " = "+result;
	}
	
	
	
}
