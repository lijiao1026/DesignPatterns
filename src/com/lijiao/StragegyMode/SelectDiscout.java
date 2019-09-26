package com.lijiao.StragegyMode;

public class SelectDiscout {
	public double select(String discountCode,int price) {
		double result=0;
		switch (discountCode) {
		case "5":
			Contect contect=new Contect(new FiveDiscount());
			result=contect.discount(price);
			break;
		case "7":
			Contect contect2=new Contect(new SevenDsicount());
			result=contect2.discount(price);
			break;
		
		}
		return result;
	}
}
