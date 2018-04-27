package com.lijiao.AbstractFactory;

public class CodHamburgerSetMeal implements AbstractFactory
{
    
    @Override
    public void createSnack()
    {
       new ChickenNugget().createSnack();;
    }
    
    @Override
    public void createDrinks()
    {
        new Coffee().createDrinks();;
    }
    
}
