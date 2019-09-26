package com.lijiao.StragegyMode;

import java.lang.reflect.InvocationTargetException;

public class Test {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Contect contect=new Contect(new SevenDsicount());
		double discountPrice1=contect.discount(100);
		System.out.println(discountPrice1);
		Contect contect2=new Contect(new FiveDiscount());
		double discountPrice2=contect2.discount(100);
		System.out.println(discountPrice2);
		
		SelectDiscout selectDiscout=new SelectDiscout();
		double discountPrice3=selectDiscout.select("5", 100);
		System.out.println(discountPrice3);
		
		ReflectSelect reflectSelect=new ReflectSelect();
		System.out.println(reflectSelect.selectDiscount("5", 100).toString());
		
	}
}
