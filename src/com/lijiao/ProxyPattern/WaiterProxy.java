package com.lijiao.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WaiterProxy implements InvocationHandler
{
    
    private Object object;
    public WaiterProxy(Object object)
    {
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
       Object result=method.invoke(object, args);
        return result;
    }
    
}
