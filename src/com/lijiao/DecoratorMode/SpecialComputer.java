package com.lijiao.DecoratorMode;

public class SpecialComputer extends AbstractSpecialComputer
{
    public AbstractComputer computer;
    public  SpecialComputer(AbstractComputer computer)
    {
        this.computer=computer;
    }
    
    
    @Override
    public String name()
    {
        return computer.name()+"加500G硬盘";
    }
    
    @Override
    public double price()
    {
        return computer.price()+500;
    }
    
}
