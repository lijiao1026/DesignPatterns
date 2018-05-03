package com.lijiao.DecoratorMode;

public class Special2Computer extends AbstractSpecialComputer
{
    
    
    public AbstractComputer computer;
    public  Special2Computer(AbstractComputer computer)
    {
        this.computer=computer;
    }
    
    @Override
    public String name()
    {
        return computer.name()+"加8G内存条";
    }
    
    @Override
    public double price()
    {
        return computer.price()+300;
    }
    
}
