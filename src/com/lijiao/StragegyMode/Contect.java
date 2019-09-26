package com.lijiao.StragegyMode;

public class Contect {

	private Stragegy stragegy;
	/**
	 * 打折方式
	 * @param stragegy
	 */
	public Contect (Stragegy stragegy) {
		this.stragegy =stragegy;
	}
	/**
	 * 打折计算
	 * @param price
	 * @return
	 */
	public double discount(int price) {
		return stragegy.discount(price);
	}
}
