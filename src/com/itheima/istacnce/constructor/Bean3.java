package com.itheima.istacnce.constructor;

public class Bean3 {
	public Bean3 () {
		System.out.println("THe factory new ing");
	}
	public Bean3 creatBean() {
		return new Bean3();
	}
	
}
