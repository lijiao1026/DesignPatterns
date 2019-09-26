package com.lijiao.TemplatePattern;

public abstract class HaveLunch {
	
	public void downstairs() {
		System.out.println("下楼");
	}
	
	public void goCanteen() {
		System.out.println("去食堂");
	}
	
	public abstract void selectMeals();
	
	public void eat(){
		System.out.println("吃完饭菜");
	}
	
	public void haveLunch() {
		downstairs();
		goCanteen();
		selectMeals();
		eat();
	}
	
}
