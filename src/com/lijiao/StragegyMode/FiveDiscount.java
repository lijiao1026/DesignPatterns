package com.lijiao.StragegyMode;

public class FiveDiscount implements Stragegy {
	/**
	 * 打5折
	 */
	@Override
	public double discount(int price) {
		// TODO Auto-generated method stub
		return price*0.5;
	}

}
