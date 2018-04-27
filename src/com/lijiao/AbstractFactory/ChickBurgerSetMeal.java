package com.lijiao.AbstractFactory;

public class ChickBurgerSetMeal implements AbstractFactory
{
    
    @Override
    public void createSnack()
    {
        new Fries().createSnack();;
    }
    
    @Override
    public void createDrinks()
    {
        new Cola().createDrinks();;
    }
    
}
