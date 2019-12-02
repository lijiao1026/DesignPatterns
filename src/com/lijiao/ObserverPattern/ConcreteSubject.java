package com.lijiao.ObserverPattern;

public class ConcreteSubject extends Subject {
	    private String messgae;
	    
	    public String getMeessgae() {
			return messgae;
		}

		public void change(String newMessage){
			messgae = newMessage;
	        System.out.println("发送消息为：" + messgae);
	        //通知各个观察者
	        this.nodifyObservers(messgae);
	    }
	
}
