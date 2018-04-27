package com.lijiao.FactoryMethod;

public class Factory
{
    public Hanburger createHanburger(int type)
    {
        switch (type)
        {
            case 1:
                return new ChickenBurger();
            case 2:
                return new CodHamburger();
            default:
                return null;
        }
    }
}
