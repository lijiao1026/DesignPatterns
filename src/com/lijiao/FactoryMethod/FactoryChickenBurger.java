package com.lijiao.FactoryMethod;

public class FactoryChickenBurger implements FactoryHanburger
{
    
    @Override
    public ChickenBurger createHanburger()
    {
        
        return new ChickenBurger();
    }
    
}
