package com.lijiao.AbstractFactory;

public class Coffee implements Drinks
{

    @Override
    public void createDrinks()
    {
       System.err.println("制造咖啡");
    }
    
}
