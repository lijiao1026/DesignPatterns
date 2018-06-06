package com.lijiao.AppearanceMode;

public class Facade
{
    Computer computer;
    
    Monitor monitor;
    
    PowerSupply powerSupply;
    
    public Facade(Computer computer, Monitor monitor, PowerSupply powerSupply)
    {
        this.computer = computer;
        this.monitor = monitor;
        this.powerSupply = powerSupply;
    }
    
    public void openAll()
    {
        powerSupply.on();
        computer.on();
        monitor.on();
        
    }
    
    public void turnOffAll()
    {
        computer.off();
        monitor.off();
        powerSupply.off();
    }
}
