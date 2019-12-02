package com.lijiao.ObserverPattern;

public class ConcreteObserver implements Observer {

	private String msg;
	@Override
	public void send(String messgae) {
		// TODO Auto-generated method stub
		msg=messgae;
		System.out.println(msg);
	}

}
