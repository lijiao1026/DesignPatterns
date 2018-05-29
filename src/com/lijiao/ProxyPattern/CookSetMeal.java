package com.lijiao.ProxyPattern;

public class CookSetMeal implements IBuySetMeal
{
    
    @Override
    public void buySetMeal()
    {
       System.out.println("烹饪套餐");
    }
    
}
