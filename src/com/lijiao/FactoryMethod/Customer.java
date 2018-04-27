package com.lijiao.FactoryMethod;

public class Customer
{
    
    public static void main(String[] args)
    {
       /*Factory factory=new Factory();
       Hanburger chickenBurger=factory.createHanburger(1);
       Hanburger codHamburger=factory.createHanburger(2); */
       FactoryChickenBurger factoryChickenBurger=new FactoryChickenBurger();
       ChickenBurger chickenBurger=factoryChickenBurger.createHanburger();
       FactoryCodHamburger factoryCodHamburger=new FactoryCodHamburger();
       CodHamburger codHamburger=factoryCodHamburger.createHanburger();
    }
    
}
