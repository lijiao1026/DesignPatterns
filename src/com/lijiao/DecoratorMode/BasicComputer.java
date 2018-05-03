package com.lijiao.DecoratorMode;

public class BasicComputer implements AbstractComputer
{
    
    @Override
    public String name()
    {
        return "基本配置电脑";
    }
    
    @Override
    public double price()
    {
        return 3000;
    }   
}
