package com.lijiao.ProxyPattern;

public class Test
{
    
    public static void main(String[] args)
    {
        Waiter waiter=new Waiter(new CookSetMeal());
        waiter.buySetMeal();
        
    }
    
}
