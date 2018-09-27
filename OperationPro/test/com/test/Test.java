package com.test;

import com.main.OperationPro;

public class Test {

	@org.junit.Test
	public void testSpeed(){
		long start = System.currentTimeMillis();
		OperationPro.mainGenerate(10, 10000);
		long end = System.currentTimeMillis();
		System.out.println("时间：" + (end - start));
	}
	
	
}
