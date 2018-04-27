package com.lijiao.FactoryMethod;

public class FactoryCodHamburger implements FactoryHanburger
{
    
    @Override
    public CodHamburger createHanburger()
    {
       
        return new CodHamburger();
    }
    
}
