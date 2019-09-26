package com.lijiao.StragegyMode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;



public class ReflectSelect {

	private static HashMap<String, Class> hashMap=new HashMap<>();
	static {
		hashMap.put("5", FiveDiscount.class);
		hashMap.put("7", ReflectSelect.class);
	}
	public Object selectDiscount(String type,int price) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1=hashMap.get(type);
		Method method= class1.getMethod("discount", int.class);
		return method.invoke(class1);
		
	}
}
