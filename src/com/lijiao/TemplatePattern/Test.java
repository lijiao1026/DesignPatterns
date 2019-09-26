package com.lijiao.TemplatePattern;

public class Test {

	public static void main(String[] args) {
		HaveLunch haveLunch=new EatBarbecuedRice();
		haveLunch.haveLunch();
		System.out.println("-----------------");
		HaveLunch haveLunch2=new EatNoodle();
		haveLunch2.haveLunch();
	}

}
