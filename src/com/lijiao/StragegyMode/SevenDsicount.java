package com.lijiao.StragegyMode;

public class SevenDsicount implements Stragegy {
	/**
	 * 打7折
	 */
	@Override
	public double discount(int price) {
		return price*0.7;
	}

	

}
