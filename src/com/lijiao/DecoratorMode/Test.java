package com.lijiao.DecoratorMode;

public class Test
{
    
    public static void main(String[] args)
    {
        BasicComputer basicComputer=new BasicComputer();
        SpecialComputer computer=new SpecialComputer(basicComputer);
        System.out.println(computer.name());
        System.out.println(computer.price());
        AbstractComputer computer2=new Special2Computer(basicComputer);
        System.out.println(computer2.name());
        System.out.println(computer2.price());
    }
    
}
