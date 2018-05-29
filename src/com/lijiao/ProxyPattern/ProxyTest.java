package com.lijiao.ProxyPattern;

import java.lang.reflect.Proxy;

public class ProxyTest
{
    
    public static void main(String[] args)
    {
      IBuySetMeal iBuySetMeal=new CookSetMeal();
      WaiterProxy waiterProxy=new WaiterProxy(iBuySetMeal);
      ClassLoader classLoader=iBuySetMeal.getClass().getClassLoader();
      IBuySetMeal buySetMeal=(IBuySetMeal) Proxy.newProxyInstance(classLoader,new Class[]{IBuySetMeal.class},waiterProxy);
      buySetMeal.buySetMeal();    
    }
    
}
