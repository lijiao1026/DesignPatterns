package com.lijiao.ProxyPattern;

public class Waiter implements IBuySetMeal
{
    private CookSetMeal cookSetMeal;
    
    public Waiter(CookSetMeal cookSetMeal)
    {
       this.cookSetMeal=cookSetMeal;
    }
    
    @Override
    public void buySetMeal()
    {
        cookSetMeal.buySetMeal();
    }
    
}
