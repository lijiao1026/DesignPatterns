package com.lijiao.flyWeight;

public class ConcreteFlyWeight implements FlyWeight
{
    private String str;
    public ConcreteFlyWeight (String string)
    {
        this.str=string;
    }
    
    @Override
    public void createLetter()
    {
       System.out.print(str);
    }
    
}
