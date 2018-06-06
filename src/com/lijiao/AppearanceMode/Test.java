package com.lijiao.AppearanceMode;

public class Test
{
    
    public static void main(String[] args)
    {
        Computer computer=new Computer();
        Monitor monitor=new Monitor();
        PowerSupply powerSupply=new PowerSupply();
        Facade facade=new Facade(computer, monitor, powerSupply);
        facade.openAll();
        facade.turnOffAll();
    }
    
}
