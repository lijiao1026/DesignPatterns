package com.lijiao.ObserverPattern;

public class TestClient {

	public static void main(String[] args) {
		ConcreteObserver concreteObserver=new ConcreteObserver();
		ConcreteSubject concreteSubject=new ConcreteSubject();
		concreteSubject.attach(concreteObserver);
		//concreteObserver.send("您收到一条待办消息");
		concreteSubject.change("您收到一条待办消息");
	}

}
